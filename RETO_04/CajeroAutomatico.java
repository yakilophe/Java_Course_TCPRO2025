package RETO_04;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("💰 Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("¿Cuánto deseas depositar? $");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("¿Cuánto deseas retirar? $");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("❌ Fondos insuficientes. Tu saldo es: $" + saldo);
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("⚠️ Opción inválida. Intenta de nuevo.");
                    continue;
            }

        } while (opcion != 4);
    }
}
