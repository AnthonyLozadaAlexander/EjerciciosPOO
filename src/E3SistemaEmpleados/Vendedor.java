package E3SistemaEmpleados;

public class Vendedor extends Empleado{
    private int ventasRealizadas;
    private double porcentajeComision;

    public Vendedor(String nombre, double salario, double porcentajeComision){
        super(nombre, salario);
        this.porcentajeComision = (porcentajeComision/100);
        ventasRealizadas = 0;
    }

    public void RegistrarVentas(){
        ventasRealizadas++;
    }

    @Override
    public double calcularPago(){
        return salarioBase + (porcentajeComision * ventasRealizadas);
    }


}
