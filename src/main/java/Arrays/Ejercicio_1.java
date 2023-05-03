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
public class Ejercicio_1 {

    /*
    Leer no más de 5 números, guardarlos en un array
    y mostrarlos en el mismo orden introducido
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int nElementos;

        do {
            System.out.println("Introduzca cuantos números quiers que tenga tu array, no más de 5");
            nElementos = Scan.nextInt();
        } while (nElementos > 5);

        int[] numeros = new int[nElementos];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ".- Introduce el número: ");
            numeros[i] = Scan.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número es: " + numeros[i]);
        }
        for (int formejorado : numeros) {
            System.out.println("El número es: " + numeros[formejorado]);
        }
    }
}
