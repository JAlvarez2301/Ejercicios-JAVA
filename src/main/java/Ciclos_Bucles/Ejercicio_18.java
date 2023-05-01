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
public class Ejercicio_18 {

    /*
    Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro, solo existen
    tres productos con precio:
    1- 0,6 $/litro
    2- 3$ litro
    3- 1.25 $/litro
     */
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        double importeFactura, facturacionTotal = 0, precioLitro = 0;

        for (int i = 1; i <= 5; i++) {
            do {

                codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº " + i + "\n Introduzca el código: "));
            } while (codigo < 1 || codigo > 3);

            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº " + i + "\n Introduzca la cantidad de litros vendida: "));

            switch (codigo) {
                case 1:
                    precioLitro = 0.6;
                    break;
                case 2:
                    precioLitro = 3;
                    break;
                case 3:
                    precioLitro = 1.25;
                    break;

            }

            importeFactura = (double) litros * precioLitro;
            facturacionTotal += importeFactura;

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Resumen de ventas ");
        System.out.println("Facturacion total: " + facturacionTotal);
        System.out.println("Cantidad vendida del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600€" + conteoMas600);
    }
}
