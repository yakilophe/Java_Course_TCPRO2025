package RETO_05;

public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A12345678");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        vuelo.reservarAsiento(pasajero1);

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();

        // Mostrar itinerario de nuevo
        System.out.println(vuelo.obtenerItinerario());

        // Reservar nuevamente con nombre y pasaporte (sobrecarga)
        vuelo.reservarAsiento("Mario Gonzalez", "M98765432");

        // Mostrar itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}

