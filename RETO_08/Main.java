package RETO_08;

public class Main {
    public static void main(String[] args) {
        // Crear declaración y cuenta
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostrar información
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                           " por $" + declaracion.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                           ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar RFC
        boolean esValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + esValido);
    }
}
