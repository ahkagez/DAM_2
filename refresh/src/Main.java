import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        LlibreDigital llibreDigital = new LlibreDigital( "3837282i", true, "Jordi Bosch", "Mentiras", 2024);
        LlibreFisic llibreFisic = new LlibreFisic("897485i", 10, "Jimena Josees", "No", 2023);

        Usuario usuario = new Usuario("Jordi", "Bosch", "48682658f");

<<<<<<< HEAD
        String mensaje = "hola";
        mensaje.

    }
=======
        LocalDate fechaIn = LocalDate.now();
        LocalDate fechaOut = LocalDate.of(2025, 11, 04);
>>>>>>> 00d1500af1429dd0a31afcd48660f3e1066f057d

        Prestamo prestamo1 = new Prestamo(llibreDigital, usuario, fechaIn, fechaOut, false);

        Biblioteca biblioteca = new Biblioteca();

        System.out.println(biblioteca);
        biblioteca.registrarPrestamo(prestamo1);
        System.out.println(biblioteca);

        biblioteca.comprobarDisponibilidad(llibreDigital);
    }
}