/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        NewClass n1=new NewClass(0.0,0.0);
        n1.display();
        System.out.println("ArttÄ±rmak Ä°stiyorsanÄ±z:");
        System.out.println("X icin:");
        double sayi1=scr.nextDouble();
        System.out.println("Y icin:");
        double sayi2=scr.nextDouble();
        System.out.println("Azaltmak Ä°stiyorsanÄ±z:");
        System.out.println("X icin:");
        double sayi3=scr.nextDouble();
        System.out.println("Y icin:");
        double sayi4=scr.nextDouble();
        
        NewClass n2 =new NewClass(sayi1,sayi2);
        n1.add(n2);
        NewClass n3=new NewClass(sayi3,sayi4);
        n1.extraction(n3);
        n1.display();
        double alan;
        double cevre;
        alan=n1.alan();
        cevre=n1.cevre();
        System.out.println("ALAN:"+alan);
        System.out.println("CEVRE:"+cevre);

    }
    
}
