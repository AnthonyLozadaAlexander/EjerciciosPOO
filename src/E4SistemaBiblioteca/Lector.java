package E4SistemaBiblioteca;

public class Lector {

    private String nombre;
    private Libro[] librosPrestados;
    private int cantLibros;

    public Lector(String nombre){
        this.nombre = nombre;
        this.librosPrestados = new Libro[3];
        this.cantLibros = 0; // inicializa la cantLibros en 0
    }

    void tomarPrestado(Libro libro){
        if(cantLibros == librosPrestados.length){
            System.out.println("Lector no puede llevar mas libros");
            return;
        }

        if(!(libro.getDisponible())){
            System.out.println("El libro " + libro.getTitulo() + " no tiene disponibles");
        }

        libro.prestar();
        librosPrestados[cantLibros] = libro;
        cantLibros++;

        System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
    }

    void mostrarLibros(){
        if(cantLibros == 0){
            System.out.println("No hay libros ingresados");
        }
        for (int i = 0; i < librosPrestados.length; i++) {
        if(librosPrestados[i] != null){
            System.out.println(librosPrestados[i].getTitulo());
        }
        }
    }


}
