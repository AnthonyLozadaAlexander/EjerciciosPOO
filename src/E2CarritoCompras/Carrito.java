package E2CarritoCompras;

class Carrito {

    private Producto[] productos;
    private int cantActual;
    private int capacidadMax;
    private final int porcentaje = 15;

    Carrito(int capacidadMax){
        this.capacidadMax = capacidadMax;
        productos = new Producto[capacidadMax];
        cantActual = 0;
    }

    void agregarProducto(Producto producto){
        if(cantActual == capacidadMax){
            System.out.println("Carrito Lleno, No se puede agregar el producto ["+ producto.getNombre()+"]");
        }

        if(cantActual < capacidadMax) {
            productos[cantActual] = producto;
            cantActual++;
        }
    }

    double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < cantActual; i++) {
            if(productos[i] != null) {
                total = total + productos[i].getPrecio();
            }
        }

        return total;
    }

    double calcularPorcentaje(){
        return (porcentaje*calcularTotal()/100);
    }

    double aplicarDescuento(){
        return calcularTotal() - (calcularPorcentaje());
    }

    String mostrarTicket(boolean des){
        StringBuilder sbInfo = new StringBuilder();
        sbInfo.append("********** TICKET DE COMPRA **********\n");
        for (int i = 0; i < cantActual;i++) {
           sbInfo.append(productos[i].mostrarDetalle()).append("\n");

        }

        sbInfo.append("Total A Pagar: " + calcularTotal()).append("\n");

        if(des == true){
          sbInfo.append("Descuento Total: " + aplicarDescuento()).append("\n");
        }

        return sbInfo.toString();
    }
}
