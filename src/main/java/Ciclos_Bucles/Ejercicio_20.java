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
public class Ejercicio_20 {

    /*
    Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo
     */

    public static void main(String[] args) {
        int numeroSueldos;
        double sueldo, sueldo_max = 0;

        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuántos sueldos quieres introducir"));

        for (int i = 1; i <= numeroSueldos; i++) {

            sueldo = Double.parseDouble(JOptionPane.showInputDialog("introduzca el sueldo Nº" + i + ": "));
            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: " + sueldo_max);
    }

}
