package RETO_05;

public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    // Constructor
    /**
     * @param codigo
     * @param destino
     * @param horaSalida
     */
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Reservar asiento con objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("✅ Reserva realizada con éxito.");
            return true;
        } else {
            System.out.println("❌ Asiento ya reservado.");
            return false;
        }
    }

    // Reservar asiento con nombre y pasaporte
    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    // Cancelar reserva
    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("❌ Cancelando reserva...");
            asientoReservado = null;
        } else {
            System.out.println("⚠️ No hay reserva para cancelar.");
        }
    }

    // Obtener itinerario
    public String obtenerItinerario() {
        String info = "\n✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        info += "Pasajero: ";
        info += (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]";
        return info;
    }
}
