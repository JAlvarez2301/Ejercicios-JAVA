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
public class ejercicio_14 {
    /*
    Pedir 10 sueldos.
    Mostrar su suma y cuantos hay mayores de 100
    */
    
    public static void main(String[] args) {
        int sueldo, sumaSueldos = 0, contadorSueldos = 0;
        
        for(int i =1; i<=10; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Voy a pedirte que introduzcas 10 sueldos:"
                    +"\n"+i+": Introduce el sueldo"));
            
            if(sueldo > 1000){
                sumaSueldos += sueldo;
                contadorSueldos++;
            }else{
                sumaSueldos += sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los sueldos es: "+sumaSueldos+"\n y sueldos superiores a 1000 hay: "+contadorSueldos);
    }
}
