public class LibroFisico extends Libro{
    private String isbn;
    private int ejemplares;


    public LibroFisico(String isbn, int ejemplares, String autor, String titulo, int anyoPublicacion){
        super(autor, anyoPublicacion, titulo);
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    @Override
    public double tarifaBase() {
        return 0;
    }

    @Override
    public boolean isDisponible(RepositorioPrestamos repositorioPrestamos) {
        if(this.ejemplares > 0) return true;
        
        return false;
    }
}
