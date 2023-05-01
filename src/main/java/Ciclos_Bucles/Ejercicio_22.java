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
public class Ejercicio_22 {

    /*
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
    
     */
    public static void main(String[] args) {
        int nota = 0, conteoSuspensos = 0;
        boolean hay_suspensos = false;

        for (int i = 1; i <= 5; i++) {
            do {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota entre 0 y 10"));
            } while (nota < 0 || nota > 10); //Para que te lo siga pidiendo si no está dentro del rango

            if (nota < 5) {
                conteoSuspensos++;
                hay_suspensos = true;
            }
        }
        if (hay_suspensos == true) {
            System.out.println("Hay suspensos, en concreto: " + conteoSuspensos);
        } else {
            System.out.println("¡Enhorabuena! No hay suspensos");
        }
    }
}
