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
public class Ejercicio12 {

    /*
    Pedor una nota de 0 a 10 y mostrarla de la siguiente dorma:
    Insuficiente, suficiente, bien, notable y sobresaliente
     */

    public static void main(String[] args) {
        int nota;
        int contador = 0;
        while (contador <3){
        nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota:"));

        switch (nota) {
            case 0:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                contador++;
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                contador++;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                contador++;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                contador++;
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                contador++;
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Suficiente");
                contador++;
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Bien");
                contador++;
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Notable");
                contador++;
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Notable");
                contador++;
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                contador++;
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Sobresaliente");
                contador++;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Algo fue mal");
                contador++;

        }
        
        }
        
    }
}
