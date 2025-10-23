import java.util.List;

public class RepositorioPrestamos implements PrestamoPersistencia{

    private List<Prestamo> prestamos;

    @Override
    public boolean registrarPrestamo(Prestamo prestamo) {
        if(!this.prestamos.contains(prestamo)){
            this.prestamos.add(prestamo);
            return true;
        }

        return false;
    }

    @Override
    public boolean cancelarPrestamo(Prestamo prestamo) {
        if(this.prestamos.contains(prestamo)){
            this.prestamos.remove(prestamo);
            return true;
        }

        return false;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}
