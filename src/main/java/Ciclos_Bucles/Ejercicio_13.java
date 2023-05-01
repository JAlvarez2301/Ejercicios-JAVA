/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos_Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio_13 {
    /*
    Pedir 10 números, mostrar la media de los numeros negaticos, la media de los mositivos y la cantidad de cero
    */
    
    public static void main(String[] args) {
        int numero, numerosNegativos = 0, numerosPositivos = 0, contadorCeros = 0, contadorPositivos = 0, contadorNegativos = 0, mediaPositivos=0, mediaNegativos=0;
        
        for(int i=1; i<=10; i++){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Vas a introducir 10 números: "));
            if(numero > 0){
                numerosPositivos += numero;
                contadorPositivos++;
            }else if( numero < 0){
                numerosNegativos += numero;
                contadorNegativos++;
            }else{
                contadorCeros++;
            }
        }
        mediaPositivos = numerosPositivos/contadorPositivos;
        mediaNegativos = numerosNegativos/contadorNegativos;
        JOptionPane.showMessageDialog(null, "El total de números positivos es: "+numerosPositivos+" y su media es: "+mediaPositivos+
                "\nEl total de números negativos es: "+numerosNegativos+" y su media es: "+mediaNegativos
                        + "\nEl total de ceros es: "+contadorCeros);
    }
}
