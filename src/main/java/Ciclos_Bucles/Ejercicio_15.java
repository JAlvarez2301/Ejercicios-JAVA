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
public class Ejercicio_15 {

    /*
    Dadas las edades y alturas de 5 alumnos, mostar la edad y la estatura media, la cantidad de alumnos
    mayores de 18 años y y la cantidad de alumnos que miden más de 1.75
     */

    public static void main(String[] args) {
        int edadAlumno, contadorMayores = 0, contadorAltos = 0, mediaEdad = 0, sumaEdad = 0, contadorEdad = 0, contadorEstatura = 0;
        double estaturaAlumno, mediaEstatura = 0, sumaEstatura = 0;

        for (int i = 1; i <= 5; i++) {
            edadAlumno = Integer.parseInt(JOptionPane.showInputDialog("Voy a pedir la edad y la estatura de 5 alumnos:"
                    + "\n" + i + "Introduce la edad: "));
            estaturaAlumno = Double.parseDouble(JOptionPane.showInputDialog("Ahora introduce le estatura: "));

            if (edadAlumno >= 18) {
                contadorMayores++;
                sumaEdad += edadAlumno;
                contadorEdad++;
            } else if (edadAlumno < 18) {
                sumaEdad += edadAlumno;
                contadorEdad++;
            } else if (estaturaAlumno > 1.75) {
                sumaEstatura += estaturaAlumno;
                contadorAltos++;
                contadorEstatura++;
            } else {
                sumaEstatura += estaturaAlumno;
                contadorEstatura++;
            }
        }
        mediaEdad = sumaEdad / contadorEdad;
        mediaEstatura = sumaEstatura / contadorEstatura;
        JOptionPane.showMessageDialog(null, "La media de la edad es: " + mediaEdad
                + "\nLa media de estatura es: " + mediaEstatura
                + "\nLos alumnos mayores de edad son: " + contadorMayores
                + "\nLos alumnos de estatura superior a 1.75 son: " + contadorAltos);

    }
}
