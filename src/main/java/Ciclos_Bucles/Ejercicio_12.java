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
public class Ejercicio_12 {
    /*
    Pedir un número y calcular su factorial
    */
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del que quieres que calculemos su factorial"));
        long factorial =1;
        
        for(int i = 1; i<=numero; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
