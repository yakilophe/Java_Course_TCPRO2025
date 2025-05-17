package RETO_13;

import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    public static void main(String[] args) {
        try {
            // Ejecutar flujo completo
            Path rutaArchivo = Paths.get("config/parametros.txt");
            guardarParametros(rutaArchivo);
            verificarArchivo(rutaArchivo);
            leerParametros(rutaArchivo);

        } catch (IOException e) {
            System.out.println("❌ Ocurrió un error durante el proceso: " + e.getMessage());
        }
    }

    // Método para guardar parámetros en el archivo
    public static void guardarParametros(Path ruta) throws IOException {
        // Crear carpeta si no existe
        Path carpeta = ruta.getParent();
        if (Files.notExists(carpeta)) {
            Files.createDirectories(carpeta);
            System.out.println("📁 Carpeta 'config/' creada.");
        }

        // Definir contenido de parámetros
        String contenido = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        // Escribir archivo
        Files.write(ruta, contenido.getBytes());
        System.out.println("✅ Archivo 'parametros.txt' creado exitosamente.\n");
    }

    // Método para verificar existencia del archivo
    public static void verificarArchivo(Path ruta) {
        if (Files.exists(ruta)) {
            System.out.println("📄 El archivo existe en: " + ruta.toAbsolutePath() + "\n");
        } else {
            System.out.println("❌ El archivo no fue creado.\n");
        }
    }

    // Método para leer y mostrar el contenido del archivo
    public static void leerParametros(Path ruta) throws IOException {
        String contenido = Files.readString(ruta);
        System.out.println("📘 Contenido del archivo de parámetros:");
        System.out.println(contenido);
    }
}
