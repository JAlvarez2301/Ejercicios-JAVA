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
public class Ejercicio_4 {
    /*
    Pedir números hasya que se teclee uno negativo y mostrar
    cuantos números se han introducido
    */
    
    public static void main(String[] args) {
        int numero, contador =0;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número, te diré cuantos has introducido."
               + "\n Cuando quieras saberlo, solo tienes que introducir un número negativo"));
       while(numero>=0){
           contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número, te diré cuantos has introducido."
               + "\n Cuando quieras saberlo, solo tienes que introducir un número negativo"));
       }
       JOptionPane.showMessageDialog(null, "Has introducido en total "+contador+" números");
    }
}
