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
public class Ejercicio_6 {
    /*
    Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
    */
    
    public static void main(String[] args) {
        int numero, sumaTotal =0;
        
        do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número, cuando teclees un 0, finalizaré el progrma"
                + "\n Te diré la suma total"));
        sumaTotal += numero;
    
        } while(numero != 0);
        JOptionPane.showMessageDialog(null, "La suma total es "+sumaTotal);
}
}

    
    

