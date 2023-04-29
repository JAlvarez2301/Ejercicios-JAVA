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
public class Ejercicio5 {
    /*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
    manera: 
    Si trabaja 40 horas o menos, se le paga 16 por hora, si trabaja más de 40 horas
    20 por cada hora extra
    */
    public static void main(String[] args) {
        int horasTrabajadas, horasNormales = 16, horasExtra = 20, sueldoTotal;
        
       horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de horas que has trabajado: "));
       
       if(horasTrabajadas <=40){
           sueldoTotal = horasTrabajadas*horasNormales;
           JOptionPane.showMessageDialog(null, "Tu sueldo es: "+sueldoTotal);
       }else{
           sueldoTotal = (horasTrabajadas-40)*horasExtra+(40*horasNormales);
           JOptionPane.showMessageDialog(null, "Tu sueldo será: "+sueldoTotal);
       }
    }
}
