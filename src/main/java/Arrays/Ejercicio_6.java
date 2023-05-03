/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {

    /*
    Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de forma
    3 de una tabla, 3 de otra y así
     */

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int a[], b[], c[];
        a = new int[12];
        b = new int[12];
        c = new int[24]; //Contiene los dos anteriores

        //Pedimos el primer array
        System.out.println("Vas a introducir el primer array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "- Introduce el número:");
            a[i] = Scan.nextInt();
        }

        //Pedimos el segundo array: 
        System.out.println("Vas a introducir el segundo array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "- Introduce el número:");
            b[i] = Scan.nextInt();
        }

        /*
        Ahora vamos a mezclarlos, el iterador i será para los arrays a y b,  y el j para el c
         */
        int i = 0;
        int j = 0;
        while (i < 12) {
//Copiamos 3 elementos de a
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
            //Copiamos 3 elementos de b
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }
        System.out.println("El array resultante sería: ");
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
