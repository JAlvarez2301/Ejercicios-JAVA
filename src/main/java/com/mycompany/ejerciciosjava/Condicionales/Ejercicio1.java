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
public class Ejercicio1 {
        /*
    Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10, que se realice 3 veces
    */
        
    public static void main(String[] args) {
        
        
        
       int numero;
       int contador = 0;
        while( contador <3 ){
      numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número: "));
     
      if( numero%10 == 0 ){
          JOptionPane.showMessageDialog(null, "El número "+numero+" es múltiplo de 10");
          contador++;
      } else {
          JOptionPane.showMessageDialog(null, "El número "+numero+" no es múltiplo de 10");
          contador++;
      }
      
      }
        JOptionPane.showMessageDialog(null, "Ejecución terminada con éxito");
    }
    
}
