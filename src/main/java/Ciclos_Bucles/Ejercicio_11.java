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
public class Ejercicio_11 {
    /*
    Diseñar un programa que muestre el producto de los 10
    primeros números impares
    */
    public static void main(String[] args) {
        int numero, productoTotal = 1, contador = 1;
        
        while(contador <=10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
            if(numero%2!=0){
                contador++;
                productoTotal*=numero;
            }
        }
        JOptionPane.showMessageDialog(null, "La multiplicacion de los 10 números es: "+productoTotal);
    }
    
}
