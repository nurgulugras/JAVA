/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevvb;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class OdevvB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sayi, faktoriyel=1;
        float e=0;
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=oku.nextInt();//kullanicidan aldigim sayi
        for(int j=0; j<=sayi; j++)//buradaki dongu e=1+1/1!.. paydalarindaki
            //faktoriyel icin
        { 
          faktoriyel=1;
          for(int i=1; i<=j; i++)//bu dongude ustteki paydalardaki islemlerin
              //hesaplanmasi icin faktoriyel hesabi yapmamizi saglayan dongu
          {
          faktoriyel=i*faktoriyel;//faktoriyelin hesaplanmasi
          
          }
          e=e+(1/faktoriyel);//e sayisinin hesaplanmasi
        }
        
        System.out.println("e sayisi = "+e);
    }
    
}
