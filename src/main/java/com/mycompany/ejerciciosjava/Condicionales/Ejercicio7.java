/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava.Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /*
    Pedir tres números y ordenarlos de mayor a menor
     */
    public static void main(String[] args) {

        int numero1, numero2, numero3, contador = 0;
        while (contador < 5) {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));
            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número:"));

            if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
                JOptionPane.showMessageDialog(null, "El número más grande es: " + numero1 + " el segundo más grande es: " + numero2 + " y el último: " + numero3);
                contador++;
            } else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
                JOptionPane.showMessageDialog(null, "El número más grande es: " + numero2 + " el segundo más grande es: " + numero1 + " y el último: " + numero3);
                contador++;
            } else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
                JOptionPane.showMessageDialog(null, "El número más grande es: " + numero2 + " el segundo más grande es: " + numero3 + " y el último: " + numero1);
                contador++;
            } else if (numero3 > numero2 && numero3 > numero1 && numero2 > numero1) {
                JOptionPane.showMessageDialog(null, "El número más grande es: " + numero3 + " el segundo más grande es: " + numero2 + " y el último: " + numero1);
                contador++;
            } else if (numero3 > numero2 && numero3 > numero1 && numero1 > numero2) {
                JOptionPane.showMessageDialog(null, "El número más grande es: " + numero3 + " el segundo más grande es: " + numero1 + " y el último: " + numero2);
                contador++;
            }

        }
    }
}
