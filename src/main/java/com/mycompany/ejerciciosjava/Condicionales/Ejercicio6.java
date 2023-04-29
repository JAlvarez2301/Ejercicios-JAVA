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
public class Ejercicio6 {
    /*
    Hacer un programa que tome dos números y diga si ambos son pares
    o impares
    */
    
    public static void main(String[] args) {
        int numero1, numero2;
        int contador =0;
        while (contador <5){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));

        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos son pares");
            contador++;
        } else if (numero1 % 2 == 0 && numero2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero1 + " es par y el número " + numero2 + " es impar");
            contador++;
        } else if (numero1%2 !=0 && numero2 %2==0) {
            JOptionPane.showMessageDialog(null, "El número "+numero1+" es impar y el número "+numero2+" es par");
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, " Son impares");
            contador++;
        }
        }
    }
    
}
