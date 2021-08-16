import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
         // method que calcula el dia de Hoy
        LocalDate today  = LocalDate.now();
        // ahora un cumpleaños
        LocalDate birthDate = LocalDate.of(1999,07,06);
        // method que calcula la edad entre dos fechas
       int years =  Period.between(birthDate, today).getYears();
       int days =  Period.between(birthDate, today).getDays();
       int meses =  Period.between(birthDate, today).getMonths();
        System.out.println(years + " años");
        System.out.println(days + " dias");
        System.out.println(" y ");
        System.out.println(meses + " meses");
    }
}

