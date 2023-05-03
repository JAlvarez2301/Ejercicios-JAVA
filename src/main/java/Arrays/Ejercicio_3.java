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
public class Ejercicio_3 {

    /*
    Leer 5 números por teclado, almacenarlos en un array y a continuación realizar
    la media de los números positivos, la media de los negativos y contar el número de ceros
     */

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int sumaPositivos = 0, conteoPositivos = 0, mediaPositivos = 0, mediaNegativos = 0, sumaNegativos = 0, conteoNegativos = 0, conteoCeros = 0;

        int[] numeros = new int[5];
        System.out.println("A continuación, vas a introducir 5 valores en un array de números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " Introduce el número: ");
            numeros[i] = Scan.nextInt();
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            } else {
                conteoCeros++;
            }
        }
        mediaPositivos = sumaPositivos / conteoPositivos;
        mediaNegativos = sumaNegativos / conteoNegativos;

        System.out.println("La media de los números positivos es: " + mediaPositivos + " y la media de los números negativos es: " + mediaNegativos
                + "\n y el número de ceros es: " + conteoCeros);
    }
}
