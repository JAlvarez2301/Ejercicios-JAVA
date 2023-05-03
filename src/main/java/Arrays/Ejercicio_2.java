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
public class Ejercicio_2 {

    /*
    Leer 5 números, guardarlos en un array y
    MOSTRARLOS EN ORDEN INVERSO al introducido
     */

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " - Introduce el número: ");
            numeros[i] = Scan.nextInt();
        }

        System.out.println("Imprimimos en orden inverso: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }

}
