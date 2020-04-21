package u8_T3_Uso_de_Stax;

public class Libro {
    private int isbn, precio;
    private String titulo, escritor;

    //Constructor por defecto
    public Libro() {

    }

    //Constructor para usar a la hora de escribir en el fichero
    public Libro(int isbn, String titulo, String escritor, int precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.escritor = escritor;
        this.precio = precio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                ", escritor='" + escritor + '\'' +
                '}';
    }
}
