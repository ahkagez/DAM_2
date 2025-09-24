public abstract class Llibre extends Recursos implements Prestable {
    private String autor;

    public Llibre(String titulo, int anyoPublicacion, String autor){
        super(titulo, anyoPublicacion);
        this.autor = autor;
    }
}
