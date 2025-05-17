package RETO_12;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class PlaneacionCooperativa {

    public static void main(String[] args) {

        // ✅ Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Expresión oral", 2));

        // 📊 Orden alfabético (natural)
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println("- " + t);
        }

        System.out.println();

        // 📊 Orden por prioridad ascendente
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("📌 Temas ordenados por prioridad (1 → urgente):");
        for (Tema t : temas) {
            System.out.println("- " + t);
        }

        System.out.println();

        // 📚 Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Expresión oral", "https://recursos.edu/oratoria");

        System.out.println("🗂️ Repositorio de recursos compartidos:");
        for (String titulo : recursos.keySet()) {
            System.out.println("- " + titulo + " → " + recursos.get(titulo));
        }
    }
}

