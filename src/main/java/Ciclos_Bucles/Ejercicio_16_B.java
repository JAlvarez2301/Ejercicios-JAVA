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
public class Ejercicio_16_B {
    //Utilizando la estructura Do While
    
    public static void main(String[] args) {
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
            
        }while(numero<0 || numero >10);
        System.out.println("La tabla de multiplicar del número "+numero+" es ");
        
        for(int i=1; i<=10;i++){
            System.out.println(numero+" * "+i+" ="+i*numero);
        }
    }
}
