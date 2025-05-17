package RETO_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroMuestras {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens"); // muestra replicada

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigadores = new HashMap<>();
        idInvestigadores.put("M-001", "Dra. López");
        idInvestigadores.put("M-002", "Dr. Hernández");
        idInvestigadores.put("M-003", "Lic. Ramírez");
        idInvestigadores.put("M-004", "Dra. López");

        // Paso 4: Mostrar resultados

        // Mostrar lista completa de muestras en orden de llegada
        System.out.println("📥 Lista de especies en orden de llegada:");
        for (String especie : listaMuestras) {
            System.out.println("- " + especie);
        }

        System.out.println();

        // Mostrar especies únicas procesadas
        System.out.println("🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println();

        // Mostrar la relación de ID de muestra → investigador
        System.out.println("🧑‍🔬 Relación de ID de muestra → Investigador responsable:");
        for (String id : idInvestigadores.keySet()) {
            System.out.println(id + " → " + idInvestigadores.get(id));
        }

        System.out.println();

        // Búsqueda por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔎 Ingresa el ID de muestra a buscar (ej. M-002): ");
        String idBuscado = scanner.nextLine();

        if (idInvestigadores.containsKey(idBuscado)) {
            System.out.println("✅ Investigador responsable: " + idInvestigadores.get(idBuscado));
        } else {
            System.out.println("❌ ID no encontrado en el registro.");
        }

        scanner.close();
    }
}

