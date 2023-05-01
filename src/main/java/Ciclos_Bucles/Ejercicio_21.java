/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos_Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio_21 {

    /*
    Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
     */
    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));

            if (numero < 0) {
                hay_negativos = true;
            }
        }
        if (hay_negativos == true) {
            System.out.println("Sí existen números negativos");
        } else {
            System.out.println("No existen números negativos");
        }
    }
}
