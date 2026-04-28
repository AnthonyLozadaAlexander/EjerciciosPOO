package E4SistemaBiblioteca;

public class Main {
    public static void main(String[] args) {
        Lector Pepito = new Lector("Pepito");
        Lector Juanito = new Lector("Juanito");

        Libro libroD = new Libro("Don Quijote", "Miguel Cervantes");
        Libro libroS = new Libro("Shakespeare", "Libro");
        Libro libroB = new Libro("Boku No Hero Academia", "Horikoshi");
        Libro libroN = new Libro("Naruto", "Masashi Kishimoto");

        Pepito.tomarPrestado(libroD); // pepito tomar prestado el libro DonQuijote
        Juanito.tomarPrestado(libroD); // Juanito intenta tomar prestado el libro DonQuijote
        Pepito.tomarPrestado(libroS);
        Pepito.tomarPrestado(libroB);
        Pepito.tomarPrestado(libroN); // Error lleva mas libros de lo que pueden llevar [3]

        Pepito.mostrarLibros(); // muestra los libros que tiene Pepito
        Juanito.mostrarLibros(); // muestra los libros que tiene Juanito


    }
}
