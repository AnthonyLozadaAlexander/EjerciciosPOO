package E3SistemaEmpleados;

public class Empleado {

    protected String nombre;
    protected Double salarioBase;

    public Empleado(String nombre, Double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    double calcularPago(){
        return salarioBase;
    }

    String mostrarDatos(){
        return "Datos Personales Del Empleado: \n" +
                 "Nombre: " + nombre + "\n" +
                 "Salario: " + calcularPago() + "\n";
    }
}
