import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.of(2026, 4, 25);

        calcularPrecio(fechaInicio, fechaFin);

        String mensaje = "hola";
        mensaje.

    }

    public static void calcularPrecio(LocalDate fechaInicio, LocalDate fechaFin){
        int mes = fechaInicio.until(fechaFin).getMonths();
        int dias = fechaInicio.until(fechaFin).getDays();
        System.out.println(dias + (mes * 30));
    }
}