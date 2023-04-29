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
public class Ejercicio_5 {
    /*
    Realizar un juego para adivinar un número.
    Para ello generar un número aleatorio entre 0 y 100, y
    luego ir pidiendo números indicando es mayor o es menor, segun sea-
    El proceso termina cuando el usuario acierta y mostrar el numero de intentos
    */
    
    public static void main(String[] args) {
        int numero,aleatorio,intentos = 0;
        
        aleatorio = (int) (Math.random()*100) ;
        
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 100, a ver si aciertas el mío, te diré cuantas veces lo has intentado: "));
            if(aleatorio > numero){
                JOptionPane.showMessageDialog(null, "Introduzca un número mayor");
            } else{
                JOptionPane.showMessageDialog(null, "Introduzca un número menor");
            }
        intentos++; // Aumentamos el contado
    } while(numero != aleatorio);
        
        JOptionPane.showMessageDialog(null, "Genial, adivinaste el número en "+intentos+" intentos");
    
}
}
