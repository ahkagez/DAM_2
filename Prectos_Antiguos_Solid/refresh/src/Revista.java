public class Revista extends Recursos {
    String issn;
    int numero;


    public Revista(String titulo, int anyoPublicacion, String issn, int numero) {
        super(titulo, anyoPublicacion);
        this.issn = issn;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "issn='" + issn + '\'' +
                ", numero=" + numero +
                '}';
    }
}
