public class LibroDigital extends Libro{
    private String isbn;
    private boolean disponible;


    public LibroDigital(String titulo, int anyoPublicacion, String autor, String isbn, boolean disponible) {
        super(titulo, anyoPublicacion, autor);
        this.isbn = isbn;
        this.disponible = disponible;
    }

    @Override
    public double tarifaBase() {
        return 0;
    }

    @Override
    public boolean isDisponible(RepositorioPrestamos repositorioPrestamos) {
        return this.disponible;
    }
}
