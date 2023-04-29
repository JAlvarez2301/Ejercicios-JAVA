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
public class Ejercicio_2 {
    /*
    Leer un número e indicar si es positivo o negativo
    El proceso debe repetirse hasta que se introduzca un 0
    */
    
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te diré si es positivo o negativo:"
                + "\n Para terminar la ejecución del programa, pulse 0 "));
        while(numero != 0){
            if(numero>0){
                JOptionPane.showMessageDialog(null, "El número es positivo");
                //numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te diré si es positivo o negativo:"
                //+ "\n Para terminar la ejecución del programa, pulse 0 "));
            } else{
                JOptionPane.showMessageDialog(null, "El número es negativo");
                //numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te diré si es positivo o negativo:"
                //+ "\n Para terminar la ejecución del programa, pulse 0 "));
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número y te diré si es positivo o negativo:"
                + "\n Para terminar la ejecución del programa, pulse 0 "));
            
            //Si lo introduzco fuera, no es necesario incluirlo en cada posible condición! Ahorra código
        }
    }
    
}
