package E4SistemaBiblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void prestar(){
        this.disponible = false;
    }

    public void devolver(){
        this.disponible = true;
    }

}
