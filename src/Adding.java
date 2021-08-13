import java.util.Scanner;

// Adding Two Numbers and add them
public class Adding {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // This gets the Integer that we type in
       int a = scan.nextInt();


        System.out.println("Enter a number: ");
        // This gets the Integer that we type in
        int b = scan.nextInt();

        // Imprimo por pantalla el resultado
        System.out.println(a+b);
    }
}


