import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

        if(this.ejemplares > 0) {

            List<Prestamo> lista = repositorioPrestamos.getPrestamos();

            if( lista.contains(this) == false){
                return true;
            }
            
            int contador = 0;
            for (int i = 0; i < lista.size(); i++) {
                Prestamo prestamo = lista.get(i);
                if(equals(prestamo.getRecurso())){
                    if(!prestamo.isDevuelto()){
                        contador++;
                    }
                }
            }

            return this.ejemplares > contador;

        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibroFisico that = (LibroFisico) o;
        return Objects.equals(isbn, that.isbn);
    }
}
