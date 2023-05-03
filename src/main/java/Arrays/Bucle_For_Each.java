/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class Bucle_For_Each {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Javier", "Luis", "Daniel", "Camacho", "Rigoberto", "Jessica", "Eucalisto"};

        //Bucle for normal
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        //Bucle for mejorado
        // i puede ser el nombre que tu quieras
        for (String i : nombres) {
            System.out.println("Nombre: " + i);
        }

    }
}
