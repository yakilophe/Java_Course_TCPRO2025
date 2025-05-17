import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        System.out.print("Número de expediente: ");
        String numeroExpediente = scanner.nextLine();

        // Crear objeto Paciente
        Paciente paciente = new Paciente();

        // Asignar los valores al objeto
        paciente.setDatos(nombre, edad, numeroExpediente);

        // Mostrar la información
        System.out.println("\nInformación del Paciente");
        paciente.mostrarInformacion();
    }
}
