/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odeva;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class OdevA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sayi, faktoriyel=1;
 
        
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=oku.nextInt();//kullanicinin girdigi sayi
        for(int i=1; i<=sayi; i++){//faktoriyeli 1 den kullanicinin girdigi sayiy kadar aldim
            faktoriyel=i*faktoriyel;//faktoriyel hesaplattigim ksim
        }
        System.out.println(sayi+" sayisinin faktoriyeli = "+faktoriyel);
        faktoriyel = 1;
        
        
    }
    
}
