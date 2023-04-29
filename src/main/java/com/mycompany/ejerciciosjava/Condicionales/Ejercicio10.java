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
public class Ejercicio10 {

    /*
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta, con meses de 28, 30 y 31 días
     */
    public static void main(String[] args) {

        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año: "));

        if (año == 0) {
            JOptionPane.showMessageDialog(null, "Has introducido mal el año");
        } else if (mes == 2 && dia >= 1 && dia <= 28) {
            JOptionPane.showMessageDialog(null, "Has introducido la fecha correctamente");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30) {
            JOptionPane.showMessageDialog(null, "Has introducido la fecha correctamente");
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
            JOptionPane.showMessageDialog(null, "Has introducido la fecha correctamente");
        } else{
             JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }

    }

}
