/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos_Bucles;

/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {
    /*
    Escribir todos los números del 100 al 0 de 7 en 7
    */
    public static void main(String[] args) {
        int i = 100;
        while(i>1){
            System.out.println(i-=7);
            i--;
        }
        System.out.println("Ahora, con un bucle for de 10 en 10");
        for(int j =100; j>0;j-=10){
            System.out.println(j);
        }
    }
    
}
