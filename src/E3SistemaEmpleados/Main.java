package E3SistemaEmpleados;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Empleado empleado = new Empleado("Hector", 120.0);
        Gerente gerente = new Gerente("Francisco", 400.0, 100.0);
        Vendedor vendedor = new Vendedor("Mario", 140.0, 20);

        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();

        vendedor.calcularPago();
        gerente.calcularPago();

        sb.append("Empleado: " + "\n" + empleado.mostrarDatos() + "\n").append("Gerente: " + "\n" + gerente.mostrarDatos() + "\n").append("Vendedor: " + "\n" + vendedor.mostrarDatos());

        System.out.println(sb.toString());
    }
}
