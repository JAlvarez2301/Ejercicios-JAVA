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
public class Ejercicio8 {
    /*
    Pedir un número entre 0 y 99.999 y decir cuentas cifras tiene
    */
    
    //Sin usar condicionales, usando condicionales hariamos un if de si es menor 10, 1, si e menor a 100, 2...
    public static void main(String[] args) {
        int numero, numerofinal;
        String numeroAnterior;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999"));
        numeroAnterior = Integer.toString(numero);
        numeroAnterior.length();
        JOptionPane.showMessageDialog(null,numerofinal = numeroAnterior.length());
        
    }
}
