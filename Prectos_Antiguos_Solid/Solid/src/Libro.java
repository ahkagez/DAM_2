public abstract class Libro extends Recurso implements Prestable {
    private String autor;

    public Libro(String titulo, int anyoPublicacion, String autor) {
        super(titulo, anyoPublicacion);
        this.autor = autor;
    }
}
