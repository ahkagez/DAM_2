import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.of(2025, 10, 23);

        calcularPrecio(fechaInicio, fechaFin);

    }

    public static void calcularPrecio(LocalDate fechaInicio, LocalDate fechaFin){
        int dias = fechaInicio.until(fechaFin).getDays();
        System.out.println(dias);
    }
}