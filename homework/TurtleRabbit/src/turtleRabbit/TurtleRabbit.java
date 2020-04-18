/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtleRabbit;
import java.util.Random;

public class TurtleRabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        //exit(0);
        Random rNesne=new Random();
        int ran=rNesne.nextInt(10)+1;
        int K=0;
        int T=0;
        int bitis=70;
        while(K<bitis && T<bitis)
        {
            
            ran=rNesne.nextInt(10)+1; // Bu adım için rastgele sayı ürettik
            System.out.println("Üretilen Rastgele sayı "+ran);
            //Kap. İçin
            int kAdim=0;
            int tAdim=0;
            
            if(ran>=1 && ran<=5 )
                kAdim=3;
            else if(ran>5 && ran<=7)
                kAdim=-6;
            else if (ran>7 && ran<=10)
                kAdim=1;
            
            // Tavşan
            if(ran>=1 && ran<=2 )
                tAdim=0;
            else if(ran>2 && ran<=4)
                tAdim=9;
            else if (ran == 5)
                tAdim=-12;
            else if(ran>5 && ran<=8)
                tAdim=1;
            else if(ran>8 && ran<=10)
                tAdim=-2;
            
            // Kap. için yeni yer
            
            K=K+kAdim;
            if(K<0)
                K=0;
            
            // Tavsan için
            
            T=T+tAdim;
            if(T<0)
                T=0;
             
            ///
            for (int i = 0; i < bitis; i++) {
                
                if(K==i)
                    System.out.print("K");
                else
                    System.out.print("-");
                
            }
            System.out.println("    ");
            
             for (int i = 0; i < bitis; i++) {
                
                if(T==i)
                    System.out.print("T");
                else
                    System.out.print("-");
                
            }
           
           
        
            System.out.println("\n");
        }
        
       
        
        
        // TODO code application logic here
    }
    
}
