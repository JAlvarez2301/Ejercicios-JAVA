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
public class Ejercicio_7 {

    /*
    Leer por teclado una serie de 10 números enteros.
    La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente
    o si están ordenados
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos el array de 10 elementos
        boolean creciente = false, decreciente = false;

        System.out.println("Vamos a llenar el array");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "Introduzca un número:");
            arreglo[i] = Scan.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo[i + 1]) { //El numero i es menor que el número que le continua
                creciente = true;
            } else if (arreglo[i] > arreglo[i + 1]) {
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("El array está en forma creciente.");
        } else if (creciente == false && decreciente == true) {
            System.out.println("El array estça en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("El array está completamente desordenado");
        } else {
            System.out.println("Todos son iguales");
        }
    }
}
