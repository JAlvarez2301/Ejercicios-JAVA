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
public class Ejercicio3 {
    /*
    Hacer un programa que lea un carácter por teclado y compruebe si es ina letra mayúscula o minúscula
    */
    public static void main(String[] args) {
        char letra;
        //Hace que escoja la primera letra
        letra = JOptionPane.showInputDialog("Introduzca una letra ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        }else if(Character.isLowerCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        } else{
            JOptionPane.showMessageDialog(null, "Algo ha debido de ir mal");
        }
    }
}
