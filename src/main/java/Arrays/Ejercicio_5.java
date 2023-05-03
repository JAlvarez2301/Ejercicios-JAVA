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
public class Ejercicio_5 {

    /*
    Leer por teclado dos tablas de 10 números enteros y
    mezclarlas una tercera de la forma el 1º0 de la A, el 1º de la B, el
    1º de la A, el 2º de la B...
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int a[], b[], c[]; //Creamos los 3 arrays
        a = new int[10];
        b = new int[10];
        c = new int[20]; //Necesita guardar los dos anteriores

        //Pedimos el array A
        System.out.println("Digite el primer array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "- Introduzca un número:");
            a[i] = Scan.nextInt();
        }

        //Pedimos el array B
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + "- Introduzca un número:");
            b[i] = Scan.nextInt();
        }

        //Ahora mezclamos ambos arrays en el C
        // utilizamos el iterados i para a y b
        //el iterador j lo usaremos para el c
        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; //Primer elemento del A
            j++; //Avanza uno
            c[j] = b[i]; // Primer elemento del B
            j++; // Avanza uno
            //Así en cada vuelta hasta hacer los 20
        }

        System.out.println("El tercer arreglo será: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
