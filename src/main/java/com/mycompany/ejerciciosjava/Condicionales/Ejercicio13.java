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
public class Ejercicio13 {
    /*
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000€, con el siguiente menú de opciones:
    1.- Ingresar dinero a la cuenta
    2.- Retirar dinero de la cuenta
    3.- Salir
    */

    public static void main(String[] args) {
        int  cantidadIngresar, cantidadRetirar, opcion, saldoFinal, contador = 0;
        int saldoInicial = 1000;
       while (contador < 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca que opción desea realizar: \n1.- Ingresar dinero a la cuenta. \n 2.- Retirar dinero de la cuenta. \n 3.- Salir"));
     
            switch (opcion) {
                case 1:
                    cantidadIngresar = Integer.parseInt(JOptionPane.showInputDialog("¿ Cuánto dinero desea ingresar? "));
                    saldoInicial += cantidadIngresar;
                    JOptionPane.showMessageDialog(null, "Ingresado con éxito, ahora tiene " + saldoInicial);
                    contador++;
                    break;
                case 2:
                    cantidadRetirar = Integer.parseInt(JOptionPane.showInputDialog("¿ Cuánto dinero desea retirar? "));
                    saldoInicial -= cantidadRetirar;
                    JOptionPane.showMessageDialog(null, "Retirado con éxito, ahora tiene " + saldoInicial);
                    contador++;
                    break;
                case 3:
                    contador++;
                    break;
                default: JOptionPane.showMessageDialog(null, "Ejecución no realizada con éxito");
            }

        }
    }
}
