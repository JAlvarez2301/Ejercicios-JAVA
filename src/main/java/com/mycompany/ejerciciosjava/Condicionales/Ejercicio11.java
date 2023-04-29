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
public class Ejercicio11 {
    /*
    Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones
    aritméticas básicas ( suma, resta, producto y división ) con valores numéricos enteros.
    El usuario debe especificar la operación con el primer carácter del primer parametro de la linea de comandos:
    S o s para sumar, R o r para resetar, P, p o m para el producto y D o d para dividir
    */
    
    public static void main(String[] args) {
        
    
    
    char operacion;
    int n1,n2,suma,resta, mult, div;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número: "));
    
    operacion = JOptionPane.showInputDialog("Introduzca la opción que desea realizar: ").charAt(0);
    
    
    
        switch (operacion) {
            case 'S': //No e necesario rellenar este ya que al no tener break pasaría al siguiente
            case 's':
                suma = n1+n2;
                JOptionPane.showMessageDialog(null, "La suma es "+suma);
                break;
            case 'r':
            case 'R':
                resta = n1-n2;
                JOptionPane.showMessageDialog(null, "La resta es "+resta);
                break;
            case 'm':
            case 'p':
            case 'P':
                mult = n1*n2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es "+mult);
                break;
            case 'D':
            case 'd':
                div = n1/n2;
                JOptionPane.showMessageDialog(null, "La division es "+div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error en la introducción");
        }
    
            
            
    }
}
