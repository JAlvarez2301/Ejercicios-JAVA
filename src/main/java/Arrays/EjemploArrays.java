/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class EjemploArrays {

    public static void main(String[] args) {
            //TipoVariable[] NombreArray = new TipoVariable[Dimension];
    
    int[] edad = new int[4];
    long[] edad1 = new long[4];
    float[] estatura = new float[3];
    double[] estatura2 = new double[3];
    String[] nombre = new String [5];
    
    //Para darle valores
    
    //Forma 1: Llenar el array manualmente
        edad[0] = 5;
        edad[1] = 6;
        edad[2] = 7;
        for(int i  = 0; i<edad.length;i++){
            System.out.println(edad[i]);
        }
        
     // Forma 2, crearlo y darle los valores directamente
     int[] numeros = new int[5];
     
    }
    
}
