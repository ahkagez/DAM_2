public class AudioVisual extends Recursos implements Prestable {
    private String director;
    private int duracion;

    public AudioVisual (String director, int duracion, String titulo, int anyoPublicacion){
        super(titulo, anyoPublicacion);
        this.director = director;
        this.duracion = duracion;

    }



    @Override
    public double tarifabase() {
        return 9.99;
    }

    @Override
    public String toString() {
        return "AudioVisual{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
