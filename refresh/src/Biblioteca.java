import java.util.*;

public class Biblioteca <T> {
    private Set<Recursos> recursos;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamo;

    public Biblioteca() {
        this.recursos = new HashSet<>();
        this.usuarios = new HashMap<>();
        this.prestamo = new ArrayList<>();
    }

    public boolean registrarPrestamo(Prestamo newPrestamo){
        this.prestamo.add(newPrestamo);
        return true;
    }

    public boolean comprobarDisponibilidad(Recursos recurso1){
        if( recurso1.getClass() == LlibreDigital.class ){
            LlibreDigital llibreDigital = (LlibreDigital) recurso1;
            return llibreDigital.isDisponible();
        }
        if( recurso1.getClass() == LlibreFisic.class ){
            LlibreFisic llibreFisic = (LlibreFisic) recurso1;
            if(llibreFisic.getEjemplares() > 0){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean contenidoRecurso(Recursos recursos){
        return false;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "recursos=" + recursos +
                ", usuarios=" + usuarios +
                ", prestamo=" + prestamo +
                '}';
    }
}
