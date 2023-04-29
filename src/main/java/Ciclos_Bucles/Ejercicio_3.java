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
public class Ejercicio_3 {
    /*
    Leer números hasta que se introduzca un 0. Indicar si es par o impar
    */
    
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, te diré si es par o impar"
                + "\n Para terminar la ejecución, introduzca 0"));
        while(numero != 0){
            if(numero%2==0){
                JOptionPane.showMessageDialog(null, "El número que has introducido es PAR ");
            }else if(numero%2 != 0){
                JOptionPane.showMessageDialog(null, "El número introducido es impar");
            }else{
                JOptionPane.showMessageDialog(null, "Sé que no es necesario, pero así practico");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, te diré si es par o impar"
                + "\n Para terminar la ejecución, introduzca 0"));
        }
    }
}
