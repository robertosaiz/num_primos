/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo_2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Primo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        String respuesta;
        
        do {
            System.out.println("Introduce un numero:");
            int numero = teclado.nextInt();
             n = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    n = n + 1;
                }
            }
            if (n == 2) {
                System.out.println("el numero " + numero + " es primo");
            } else {
                System.out.println("el numero " + numero + " no es primo");
            }
            System.out.println("Quieres intoducir otro numero? si/no");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("si"));
        if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("Fin de la operacion");
        } else {
            System.out.println("error. Fin de la operacion.");
        }
    }

}
