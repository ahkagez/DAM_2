import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
    private Set<Recursos> recursos;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamo;

    public Biblioteca(Set<Recursos> recursos, Map<String, Usuario> usuarios) {
        this.recursos = recursos;
        this.usuarios = usuarios;
        this.prestamo = new ArrayList<>();
    }

    public boolean registrarPrestamo(Prestamo newPrestamo){
        this.prestamo.add(newPrestamo);
        return true;
    }

    public boolean comprobarDisponibilidad(Recursos recursos){

        return false;
    }

    public boolean contenidoRecurso(Recursos recursos){
        return false;
    }
}
