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
public class Ejercicio_19 {

    /*
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados( = 4) y suspensos
     */
    public static void main(String[] args) {
        double nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce una nota entre 0 y 10"));
            } while (nota < 0 || nota > 10); // Para que se siga ejecutando mientras no sea en el rango 0 y 10
            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de suspensos: " + suspensos);
        System.out.println("Cantidad de condicionados: " + condicionados);
    }
}
