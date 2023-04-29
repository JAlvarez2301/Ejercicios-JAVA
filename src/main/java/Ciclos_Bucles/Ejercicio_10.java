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
public class Ejercicio_10 {
    /*
    Pedir 10 números y escribir la suma total
    */
    
    public static void main(String[] args) {
        int numero, suma = 0;
        
        for(int i =1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
            
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números es: "+suma);
 
    }
}
