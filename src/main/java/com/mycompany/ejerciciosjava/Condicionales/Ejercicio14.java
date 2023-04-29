/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava.Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /*
    Hacer un programa que pase de Kg a otra unidad de medida de msa, mostrar en pantalla un menu de opciones
     */
    
    public static void main(String[] args) {
        double medida;
        int opcion;
        medida = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de kg: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción de menu: "
                + "\n1.- Hectogramos "
                + "\n2.- Decagramos"
                + "\n3.- Gramos"
                + "\n4.- Decigramos"
                + "\n5.- Centigramos"
                + "\n6.- Miligramos"));
        
        switch (opcion) {
            case 1:
                medida *= 10;
                JOptionPane.showMessageDialog(null, "La nueva medida en Hectogramos es " + medida);
                break;
            
            case 2:
                medida *= 100;
                JOptionPane.showMessageDialog(null, "La nueva medida en Decagramos es " + medida);
                break;
            case 3:
                medida *= 1000;
                JOptionPane.showMessageDialog(null, "La nueva medida en Gramos es " + medida);
                break;
            case 4:
                medida *= 10000;
                JOptionPane.showMessageDialog(null, "La nueva medida en Decigramos es " + medida);
                break;
            case 5:
                medida *= 100000;
                JOptionPane.showMessageDialog(null, "La nueva medida en Centigramos es " + medida);
                break;
            case 6:
                medida *= 1000000;
                JOptionPane.showMessageDialog(null, "La nueva medida en Miliigramos es " + medida);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            
           
        }
        
        
        
        
    }
}
