package E5;

public class Paypal extends MetodoPago{
    private String correoElectronico;

    public Paypal(String titular, String correoElectronico){
        super(titular);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Conectando A La Cuenta Paypal de "+ correoElectronico +"\n" + "Pago de $" + monto + " procesando");
    }

    @Override
    void imprimirRecibo(double monto) {
        super.imprimirRecibo(monto);
    }
}
