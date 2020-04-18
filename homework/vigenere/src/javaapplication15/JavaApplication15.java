/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        islemler islemler=new islemler();
        Scanner oku=new Scanner(System.in);
        System.out.println("Sifrenelicek metni giriniz:");
        String metin=oku.nextLine();
        System.out.println("Sifreyi giriniz giriniz:");
        String sifrem=oku.nextLine();
        String yeni=islemler.encrypt(metin,sifrem);
        System.out.println("Sifrelenen metin:" + yeni);
    
}
}
