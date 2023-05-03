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
public class Ejercicio_4 {

    /*
    Leer 10 números enteros y guardarlos en un array.
    Debemos mostrarlos en el siguiente orden:
    El primero, el ultimo, el segundo, el penultimo, el tercero...
     */

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int numeros[] = new int[10]; //Creamos un array de 10 elementos

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " - Introduce un número: ");
            numeros[i] = Scan.nextInt();
        }
        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i] + " ");//Imprime el primero
            System.out.println(numeros[9 - i] + " "); //Imprime el último número del arreglo
        }
    }
}
