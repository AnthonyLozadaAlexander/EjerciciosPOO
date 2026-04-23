package E2CarritoCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op; boolean des=false; String nombre; int edad; String cedula;
        Bienvenida();

        System.out.println("     Ingrese El Nombre");
        nombre = input.nextLine();
        System.out.println("     Ingrese La Edad");
        edad = input.nextInt();

        input.nextLine(); // limpia de buffer

        System.out.println("     Ingrese La Cedula");
        cedula = input.nextLine();

        Persona Cliente = new Persona(nombre, edad, cedula);

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

        carrito.calcularTotal();
        System.out.println(Cliente.datosPersonales());
        System.out.println("--------Lista De Productos---------");
        System.out.println(carrito.mostrarTicket(des));
        System.out.println("¿Desea Aplicar Un Descuento? (S/N)");
        op = input.nextLine();
        if(op.equalsIgnoreCase("S")){
            des = true;
            carrito.aplicarDescuento();
            System.out.println("    Descuento Aplicado Del 15%");
        }

        System.out.println(carrito.mostrarTicket(des));

    }
    static void Bienvenida(){
        System.out.println("--------------------------------");
        System.out.println("Bienvenido Al Carrito De Compras");
        System.out.println("--------------------------------");
    }
}
