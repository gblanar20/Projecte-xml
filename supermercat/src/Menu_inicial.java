import java.util.InputMismatchException;
import java.util.Scanner;
 
public class menu_inicial {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Stock");
            System.out.println("2. Vendes");
            System.out.println("3. Sortir");
 
            try {
 
                System.out.println("Escriu una de les opcions: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionat l'opció 1.");
                        menustock();
                        break;
                    case 2:
                        System.out.println("Has seleccionat l'opció 2.");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solament números entre 1 i 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Eucriu un número: ");
                sn.next();
            }
        }
    }
    public static void menustock() {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int stock;
        
        while (!salir) {
 
            System.out.println("1. Afegir productes");
            System.out.println("2. Consultar");
            System.out.println("3. Sortir");
 
            try {
 
                System.out.println("Escriu una de les opcions: ");
                opcion = sn.nextInt();
 
                switch (stock) {
                    case 1:
                        System.out.println("Has seleccionat l'opció 1.");
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionat l'opció 2.");
                        
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solament números entre 1 i 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escriu un número: ");
                sn.next();
            }
        }
    }
}
