package E2CarritoCompras;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito(5);
        Producto Tablet = new Producto(23, "Samsung S12", 450.00);
        Producto Telefono = new Producto(45, "IPhone 12", 567.00);
        Producto Empanadas = new Producto(23, "Empanadas De Queso", 256.00);
        Producto Hamburguesa = new Producto(56, "Hamburguesa con Queso", 2.50);
        Producto Gaseosa = new Producto(78, "Gaseosa Coca-Cola", 1.30);

       carrito.agregarProducto(Tablet);
       carrito.agregarProducto(Telefono);
       carrito.agregarProducto(Empanadas);
       carrito.agregarProducto(Hamburguesa);
       carrito.agregarProducto(Gaseosa);

        System.out.println(carrito.mostrarTicket());
        carrito.aplicarDescuento(15);
        System.out.println("Total a Pagar Con El Descuento Del 15%: " + "\n" +
                carrito.mostrarTicket());
    }
}
