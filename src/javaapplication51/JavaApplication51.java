/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO S06");
        
        //PRODUCTO N°1
        String nombre1 = "";
        int cantidad1 = 0;
        double precio1 = 0;
        //PRODUCTO N°2
        String nombre2 = "";
        int cantidad2 = 0;
        double precio2 = 0;
        //PRODUCTO N°3
        String nombre3 = "";
        int cantidad3 = 0;
        double precio3 = 0;
        
        Scanner fm = new Scanner(System.in);
        
        System.out.println("ingrese\"nombre\"producto01:   ");
        nombre1 = fm.next();
        System.out.println("ingrese\"cantidad\"producto01:   ");
        cantidad1 = fm.nextInt();
        System.out.println("ingrese\"precio\"producto01:   ");
        precio1 = fm.nextDouble();
        System.out.println("ingrese\"nombre\"producto02:   ");
        nombre2 = fm.next();
        System.out.println("ingrese\"cantidad\"producto02:   ");
        cantidad2 = fm.nextInt();
        System.out.println("ingrese\"precio\"producto02:   ");
        precio2 = fm.nextDouble();
        System.out.println("ingrese\"nombre\"producto03:   ");
        nombre3 = fm.next();
        System.out.println("ingrese\"cantidad\"producto03:   ");
        cantidad3 = fm.nextInt();
        System.out.println("ingrese\"precio\"producto03:   ");
        precio3 = fm.nextDouble();
        
        
        double subtotal = 0;
        subtotal += cantidad1 + precio1;
        subtotal += cantidad2 + precio2;
        subtotal += cantidad3 + precio3;
        
        double inpuesto = subtotal * 0.10;
        double total = subtotal + inpuesto;
        
        
        
        
        
    }        
    
}
