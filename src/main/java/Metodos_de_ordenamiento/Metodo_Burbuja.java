/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_de_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Metodo_Burbuja {
    /*
    Funciona revisando cada elemento de la lista, intercambiándolos si están en el orden equivocado, por lo que
    resulta en un array ordenado
    si numeroActual > numeroSiguiente, cambio, sino... avanzamos
    */
    
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int array[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de elementos que tendrá tu array: "));
        
        array = new int[nElementos];
        
        for(int i =0;i<nElementos;i++){
            System.out.println((i+1)+"- Introduzzca un número");
            array[i] = Scan.nextInt();
        }
        //Método burbuja
        for(int i =0; i<nElementos-1;i++){
            for(int j =0;j<nElementos-1;j++){
                if(array[j] > array[j+1]){ // si numeroActual > numeroSiguiente
                    aux = array[j]; //Variable auxiliar = al valor actual
                    array[j] = array [j+1]; //Valor actual es igual al valor del numero siguiente
                    array[j+1] = aux; // Numero siguiente igual aux, es decir el primer número
                    //Intercambio realizado
                }
            }
        }
        System.out.println("Mostrando el array ordenado en forma creciente: ");
        for(int i=0; i<nElementos;i++){
            System.out.println(array[i]+" ");
        }
    }
}
