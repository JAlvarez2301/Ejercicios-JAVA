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
public class Ejercicio4 {
    /*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya ompra supere los 300€, ¿ Cuál será
    la cantidad que pagará una persona por su compra ?
    */
    public static void main(String[] args) {
        double PrecioCompra, PrecioFinal;
        
        
        PrecioCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio total de tu compra: "));
        if(PrecioCompra > 300){
            PrecioFinal = (PrecioCompra*0.8);
             JOptionPane.showMessageDialog(null, "Tu precio de compra es "+PrecioFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Tu precio de compra sigue siendo "+PrecioCompra);
        }
        
        
    }
}
