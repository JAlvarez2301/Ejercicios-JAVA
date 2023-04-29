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
public class Ejercicio9 {

    /*
    Pedir el día, mes y año de una fecha  indicar si la fecha es correcta
    Supondremos que todos los meses tienen 30 días
     */
    public static void main(String[] args) {

        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año: "));

        if (dia >= 1 && (dia <= 30)) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es CORRECTA");
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, día incorrecto");
        }

    }
}
