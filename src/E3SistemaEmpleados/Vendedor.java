package E3SistemaEmpleados;

public class Vendedor extends Empleado{
    private double comisionPorVenta;
    private int ventasRealizadas;

    public Vendedor(String nombre, double salario, double comisionPorVenta){
        super(nombre, salario);
        this.comisionPorVenta = comisionPorVenta;
        ventasRealizadas = 0;
    }

    void RegistrarVentas(){
        ventasRealizadas++;
    }

    @Override
    public double calcularPago(){
        return salarioBase + (comisionPorVenta * ventasRealizadas);
    }


}
