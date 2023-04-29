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
public class Ejercicio1 {
    /*
    Leer un número y mostrar su raíz cuadrada, repetir el proceso hasta que
    se introduzca un número negativo
    */
    
    public static void main(String[] args) {
        int numero =0;
        while(numero >=0)
        
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, para terminal el programa introduzca un numero negativo: "));
            System.out.println(Math.sqrt(numero)); 
        }
    }
    
}
