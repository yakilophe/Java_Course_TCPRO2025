package RETO_02;

public class Entrada {
    private String nombreEvento;
    private double precio;

    // Constructor
    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }
}
