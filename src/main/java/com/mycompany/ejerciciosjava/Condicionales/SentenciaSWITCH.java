/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava.Condicionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SentenciaSWITCH {
    public static void main(String[] args) {
        int dato;
        Scanner Scan = new Scanner (System.in);
        System.out.println("Introduzca un valor entre 1 y 5: ");
        dato = Scan.nextInt();
        
        boolean condicion = false;
        while(condicion == false){
        //Creamos el bucle con la condicion para que le pregunte al usuario hasta que lo escriba bien
        switch(dato) {
            case 1: System.out.println("Este es el caso número 1: ");
            condicion = true;
                break;
            case 2: System.out.println("Este ese el caso numero 2");
            condicion = true;
                break;
            case 3: System.out.println("Este es el caso número 3");
            condicion = true;
                break;
            case 4: System.out.println("Este es el caso número 4");
            condicion = true;
                break;
            case 5: System.out.println("Este es el caso número 5");
            condicion = true;
                break;
            default: System.out.println("El número no está en el rango anteriormente mencionado");
                condicion = false;
                System.out.println("Introduzca un valor entre 1 y 5: ");
                dato = Scan.nextInt();
                
        }
        }
    }
    
}
