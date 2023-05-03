/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Llenar_Un_Array {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de elementos que tendrá tu array: "));

        char[] letras = new char[nElementos];

        System.out.println("Introduzca los elementos del array: ");
        for (int i = 0; i < letras.length ; i++) { //Como el array empieza en 0, si no ponemos el -1, va a introducir un caracter más
            System.out.println((i + 1) + "- Introduzca un caracter: "); // Aunque el array empieza en 0, pero se le hace entendible al usuario
            letras[i] = Scan.next().charAt(0);
        }
        System.out.println("Los caracteres del array son: ");

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i] + " ");
        }

    }
}
