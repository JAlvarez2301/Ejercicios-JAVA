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
public class Ejercicio2 {
    /*
    Pedir dos números y decir cual es mayor o si son iguales
    */
    public static void main(String[] args) {
        
        int numero1,numero2,contador =0;
        while(contador < 3){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));
        
        if(numero1 > numero2 ){
            JOptionPane.showMessageDialog(null, "El número "+numero1+" es el mayor");
            contador++;
        }
        else if (numero2 > numero1){
            JOptionPane.showMessageDialog(null, "El número "+numero2+" es el mayor");
            contador++;
        
    } else {
            JOptionPane.showMessageDialog(null, "Los números "+numero1+" y "+numero2+" son iguales" );
            contador++;
        }
        
        }
        
    }
}
