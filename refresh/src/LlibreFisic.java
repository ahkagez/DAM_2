public class LlibreFisic extends Llibre{
    private String isbn;
    private boolean ejemplares;


    public LlibreFisic(String isbn, boolean ejemplares, String autor, String titulo, int anyoPublicacion){
        super(autor, anyoPublicacion, titulo);
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    @Override
    public double tarifabase() {
        return 0;
    }

    @Override
    public String toString() {
        return "LlibreDigital{" +
                "isbn='" + isbn + '\'' +
                ", disponible=" + ejemplares +
                '}';
    }
}
