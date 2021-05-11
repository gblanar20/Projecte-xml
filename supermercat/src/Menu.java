/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPERMERCADO;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Leal Ascensores
 */
public class HOJA1 {

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
                        menuStock();
                        break;
                    case 2:
                        System.out.println("Has seleccionat l'opció 2.");
                        menuVentas();
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

    public static void menuStock() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        System.out.println("MENU STOCK");
        System.out.println("1. Afegir producte");
        System.out.println("2. Consultar listado de productos ");
        System.out.println("3. Sortir");

            try {

                System.out.println("Escriu una de les opcions: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionat l'opció 1.");
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionat l'opció 2.");
                        leerListado();
                        break;
                    case 3:
                        salir  = true;
                        break;
                    default:
                        System.out.println("Solament números entre 1 i 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Eucriu un número: ");
                sn.next();
            }
        }
    public static void menuVentas() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        System.out.println("MENU VENTAS");
        System.out.println("1.Nueva Venta");
        System.out.println("2.Sortir");

            try {

                System.out.println("Escriu una de les opcions: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionat l'opció 1.");
                        nuevaVenta();
                        break;
                    case 2:
                        salir  = true;
                        break;
                    default:
                        System.out.println("Solament números entre 1 i 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Eucriu un número: ");
                sn.next();
            }
        }
    
    public static void nuevaVenta(){
        
        int codigo = 0, cantidad;
        Scanner sn = new Scanner(System.in);
        System.out.println("Nueva venta");
        
        System.out.println("Ingrese codigo de producto, 0 para finalizar");
        codigo= sn.nextInt();
        System.out.println("Ingrese cantidad");
        cantidad= sn.nextInt();
        System.out.println("");
        
        }
    
    
    public static void leerListado(){
        Scanner sc = new Scanner(System.in);
        
        String nom = "stock.txt";
    
        try {
            sc = new Scanner(new File(nom));
            
    }catch (FileNotFoundException e) {
            System.out.println("No s'ha trobat el fitxer: "+nom);
            System.out.println(e);
        }
        }
    
}

