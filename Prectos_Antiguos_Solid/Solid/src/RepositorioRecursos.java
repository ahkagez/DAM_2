import java.util.Set;

public class RepositorioRecursos implements RecursoPersistencia {
    private Set<Recurso> recursos;

    public RepositorioRecursos(Set<Recurso> recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean altaRecurso(Recurso recurso) {
        if (!this.recursos.add(recurso)){
            this.recursos.add(recurso);
            return true;
        }

        return false;
    }

    @Override
    public boolean bajaRecurso(Recurso recurso) {
        if (this.recursos.contains(recurso)){
            this.recursos.remove(recurso);
            return true;
        }

        return false;
    }

    public Set<Recurso> getRecursos() {
        return recursos;
    }
}
