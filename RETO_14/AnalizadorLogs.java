package RETO_14;

import java.io.*;
import java.nio.file.*;

public class AnalizadorLogs {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }

                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // 📊 Mostrar resultados
            System.out.println("✅ Análisis completado:");
            System.out.println("📄 Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Total de errores: " + totalErrores);
            System.out.println("⚠️ Total de advertencias: " + totalWarnings);

            double porcentaje = 0;
            if (totalLineas > 0) {
                porcentaje = ((double)(totalErrores + totalWarnings) / totalLineas) * 100;
            }

            System.out.printf("📈 Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println("❌ Ocurrió un error al procesar el archivo: " + e.getMessage());

            // Guardar mensaje de error en archivo alternativo
            try {
                Files.writeString(rutaRegistroFallos, "Error al procesar el archivo: " + e.getMessage());
                System.out.println("📝 Mensaje registrado en 'registro_fallos.txt'.");
            } catch (IOException ex) {
                System.out.println("❌ No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
