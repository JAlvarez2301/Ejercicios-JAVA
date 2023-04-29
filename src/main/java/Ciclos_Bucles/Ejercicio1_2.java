/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos_Bucles;

import java.util.Scanner;

public class Ejercicio1_2
// Ahora, en vez de la raíz cuadrada, el cuadrado
{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, cuadrado;

        System.out.println("Introduzca un número");

        numero = entrada.nextInt();

        while (numero >= 0) {

            cuadrado = (int) Math.pow(numero, 2);

            System.out.println("EL cuadrado de el número " + numero + " es " + cuadrado);
            System.out.println("Introduzca un número");
            numero = entrada.nextInt();

        }

        System.out.println("Digite otro número");

    }

}
