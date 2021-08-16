import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DiffJyV {

        public static void main(String[] args) {

            // method que calcula el dia de Hoy
            LocalDate CumpleJoaco =  LocalDate.of(1994,12,07);
            // ahora un cumpleaños
            LocalDate CumpleVale = LocalDate.of(1999,07,06);

            // method que calcula la edad entre dos fechas
            int years =  Period.between(CumpleJoaco, CumpleVale).getYears();
            int days =  Period.between(CumpleJoaco, CumpleVale).getDays();
            int meses =  Period.between(CumpleJoaco, CumpleVale).getMonths();
            System.out.println(years + " años");
            System.out.println(days + " dias");
            System.out.println(" y ");
            System.out.println(meses + " meses");
        }
    }

