public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;

    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + this.nombre + '\'' +
                ", apellidos='" + this.apellidos + '\'' +
                ", dni='" + this.dni + '\'' +
                '}';
    }
}
