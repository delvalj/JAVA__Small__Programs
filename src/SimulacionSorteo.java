import java.util.Random;

public class SimulacionSorteo {
    public static void main(String[] args) {

        // Simulación 6 Números Ganadores de un Sorteo en el que participan 1000 números

        Random NumerosGanadores = new Random();

        System.out.println("Los Números Ganadores Son: " );

        for(int i = 0; i < 6; i++) {
            int x = NumerosGanadores.nextInt(1000);
            System.out.println(+ (x+1));
        }
    }
}
