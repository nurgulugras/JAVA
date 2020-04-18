/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author acer
 */
public class islemler {
     public static String encrypt(String text,String key)
    {
        String r="";//yeni olusturulan metin icin
        text=text.toUpperCase();//mesaji buyultmek icin 
        for(int i=0,j=0; i<text.length();i++)//for dongusu mesajdaki tüm
            //kullandim
        {
            char c=text.charAt(i);//i hangi mesajin hangi
            //karakterde oldugunu gosteriyor.
            
            if(c<'A'||c>='Z')//karakterin uygunlunu kontrol ettim
                continue;
            r += (char) ((c + key.charAt(j) +'A'+8) % 26 + 'A');
            j=++j % key.length();
        }
         return r;
    }
    
}
