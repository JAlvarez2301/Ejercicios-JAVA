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
public class Ejercicio_17 {
    /*
    Una empresa que se dedica a la venta de esinfectantes necesita un programa apra gestionar las facturas. En cada factura figuda: el codigo del artículo, la cantidad
    vendida en litros y el precio por litro. Se pide 5 facturas introducidas:
    Facturación total, cantidad en litros vendidos y cuantas facturas se emitieron de más de 600
    */
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        double precioLitro,importeFactura, facturacionTotal = 0;
        
        for(int i = 1; i<=5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº "+i+"\n Introduzca el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº "+i+"\n Introduzca la cantidad de litros vendida: "));
            precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Artículo Nº "+i+"\n Introduzca el precio / litro:"));
          
            importeFactura = (double) litros* precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo == 1){
                litrosArticulo1 += litros;  
            }
            if(importeFactura >600){
                conteoMas600++;
            }
    }
        System.out.println("Resumen de ventas ");
        System.out.println("Facturacion total: "+facturacionTotal);
        System.out.println("Cantidad vendida del articulo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600€"+conteoMas600);
    }
}
