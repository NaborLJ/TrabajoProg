/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprog.Personaje;

import java.awt.BorderLayout;
import java.util.Random;

/**
 *
 * @author nlopezjimenez
 */
public class Asesino {
    int salud=570;
    int energia=550;
    private Random rand = new Random(System.nanoTime());
     public int GolpeSombrio(){
        //consume 60% mana 
         if(energia>330){
             
             this.energia=energia-330;
             return (int) (Math.random()*(200-300));
         }
     else
        System.out.println("¡No hay suficiente energia! Energía actual: "+energia);
        return 0;
     }
     
    public int BrechaNegra(){
        //consume 30% mana 
        if(energia>165){
        this.energia=energia-165;
        return (int) (Math.random()*(200-300));
        }else
            System.out.println("¡No hay suficiente energía! Energía actual "+energia);
        return 0;
        }
        
        
   
    
    public int DanzaDeLaMuerte(){
        //consume 80% Ataque curativo total 
        if(energia>440){
        this.energia=energia-440;
        return (int) (Math.random()*(200-300));
    }else
          System.out.println("¡No hay suficiente energía! Energía actual "+energia);
         return 0;
    }
        
     public int AtaqueRandomBasico(){
     return (int) (Math.random()*(30-60)+1);
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        if(energia>40){
        this.energia=energia-40;
        return (int) (Math.random()*(68-80)+1);
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energia);
        return 0;
}
    public int AtaqueRandomMedio(){
        if(energia>60){
            this.energia=energia-60;
      return (int) (Math.random()*(87-120)+1);
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energia);
        return 0;
}
    public void AtaquesAsesino(){
        int Puñalada=AtaqueRandomBasico();
        int AluvionDeAcero=AtaqueRandomBajo();
        int Desgarrar=AtaqueRandomMedio();
        int AtaqueEspecial=GolpeSombrio();
        
        
    }
}
