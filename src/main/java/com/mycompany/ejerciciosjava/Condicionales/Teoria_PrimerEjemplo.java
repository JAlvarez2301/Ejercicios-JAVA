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
public class Teoria_PrimerEjemplo {

    public static void main(String[] args) {

        int numero, dato = 5;
        //Le vamos a pedir a usuario la variable número, debemos hacer un casting
        //Si es igual a dato, ha acertado
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número, a ver si aciertas el número escondido: "));
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El número que debías de adivinar es 5, ¡ enhorabuena !");
        } else {
            JOptionPane.showMessageDialog(null, "El número es diferente, no has acertado");
        }

        //Vamos a hacer un bucle para que no deje de preguntar al usuario hasta que acierte
        boolean condicion = false;
        int contador = 0; // Vamos a hacer que cuente cuanto tarda en acertar

        while (condicion == false) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
            if (numero == dato) {
                JOptionPane.showMessageDialog(null, "El número que debías de adivinar es 5, ¡ enhorabuena !");
                condicion = true;
            } else {
                JOptionPane.showMessageDialog(null, "El número es diferente, no has acertado");
                condicion = false;
                contador++;

            }
        }
    }

}
