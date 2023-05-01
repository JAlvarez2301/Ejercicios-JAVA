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
public class Ejercicio_16 {

    /*
    Pide un número que debe estar entre 0 y 10 y mostrar la tabla de multiplicar de dicho número
     */

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te escribiré su tabla de multiplicar:"));
        for (int i = 1; i <= 10; i++) {
            JOptionPane.showMessageDialog(null, i + " x " + numero + " = " + i * numero);
        }

    }
}
