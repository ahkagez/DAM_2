public class LlibreDigital extends Llibre{
    private String isbn;
    private boolean disponible;


    public LlibreDigital(String isbn, boolean disponible, String autor, String titulo, int anyoPublicacion){
        super(autor, anyoPublicacion, titulo);
        this.isbn = isbn;
        this.disponible = disponible;
    }

    @Override
    public double tarifabase() {
        return 0;
    }

    @Override
    public String toString() {
        return "LlibreDigital{" +
                "isbn='" + isbn + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
