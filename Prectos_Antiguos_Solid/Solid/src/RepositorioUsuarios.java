import java.util.Set;

public class RepositorioUsuarios implements UsuarioPersistencia{
    private Set<Usuario> usuarios;

    public RepositorioUsuarios(Set<Usuario> usuario) {
        this.usuarios = usuario;
    }


    @Override
    public boolean altaUsuario(Usuario usuario) {
        if (this.usuarios.contains(usuario)){
            return false;
        } else {
            this.usuarios.add(usuario);
            return true;
        }
    }

    @Override
    public boolean bajaUsuario(Usuario usuario) {

        if (this.usuarios.contains(usuario)){
            this.usuarios.remove(usuario);
            return true;
        }

        return false;
    }
}
