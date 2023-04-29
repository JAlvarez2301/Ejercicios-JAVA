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
public class Ejercicio_7 {

    /*
    Pedir números hasta que se introduzca 0,
    y calcular la media
     */
    public static void main(String[] args) {
        int numero, contador = 0, suma = 0;
        double media;
        do {
           
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce números, cuando quieras que calcule la media, introduce un número negativo"));
            if(numero != 0 && numero >0){
            suma += numero;
            contador++;
            }

        } while (numero > 0);

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Error, la división entre 0 no es posible");
        } else {
            System.out.println(suma);
            media = (double) suma / contador;
            media = suma / contador;
            JOptionPane.showMessageDialog(null, "La media es: " + media);
        }
    }

}
