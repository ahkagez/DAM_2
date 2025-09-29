import java.util.Set;

public class RepositorioUsuarios implements UsuarioPersistencia{
    private Set<Usuario> usuarios;

    public RepositorioUsuarios(Set<Usuario> usuario) {
        this.usuarios = usuario;
    }


    @Override
    public boolean altaUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return true;
    }

    @Override
    public boolean bajaUsuario(Usuario usuario) {
        return false;
    }
}
