/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos_Bucles;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo_While {

    /*Teoría
    while(condicion){
        Instrucciones;
}
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        int i =1, contador;
        System.out.println("Introduzca cuantos números quieres en pantalla");
        contador = Scan.nextInt();
        
        while(i<=contador){
            System.out.println(i);
            i+=3;   
        }

    }
}
