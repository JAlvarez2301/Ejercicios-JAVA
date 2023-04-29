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
public class Ejercicio_8 {

    /*
    Pedir un numero N, y mostrar todos los números del 1 al N
     */
    public static void main(String[] args) {
        int n;
        int i = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("introduce un número:"));
        while (i < n) {
            //JOptionPane.showMessageDialog(null, i); Mejor un sout
            System.out.println(i);
            i++;
        }

    }
}
