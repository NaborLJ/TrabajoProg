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
     int saludAsesino=570;
    int energiaAsesino=550;
    int dañoAsesino;
    private Random rand = new Random(System.nanoTime());
  
    
    public int GolpeSombrio(){
        //consume 60% mana 
         if(energiaAsesino>330){
             
             this.energiaAsesino=energiaAsesino-330;
            return (int) (Math.random()*(200-300));
             
         }
     else
        System.out.println("¡No hay suficiente energia! Energía actual: "+energiaAsesino);
        return 0;
     }
     
    public int BrechaNegra(){
        //consume 30% mana 
        if(energiaAsesino>165){
        this.energiaAsesino=energiaAsesino-165;
        this.dañoAsesino=(int) (Math.random()*(200-300));
        return dañoAsesino;
        }else
            System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
        }
        
    public int DanzaDeLaMuerte(){
        //consume 80% Ataque curativo total 
        if(energiaAsesino>440){
        this.energiaAsesino=energiaAsesino-440;
        this.dañoAsesino=(int) (Math.random()*(200-300));
        return dañoAsesino;
    }else
          System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
         return 0;
    }
        
     public int AtaqueRandomBasico(){
     this.dañoAsesino=(int) (Math.random()*(30-60)+1);
     return dañoAsesino;
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        if(energiaAsesino>40){
        this.energiaAsesino=energiaAsesino-40;
        this.dañoAsesino=(int) (Math.random()*(68-80)+1);
        return dañoAsesino;
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
}
    public int AtaqueRandomMedio(){
        if(energiaAsesino>60){
            this.energiaAsesino=energiaAsesino-60;
        this.dañoAsesino= (int) (Math.random()*(87-120)+1);
        return dañoAsesino;
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
}
    public void AtaquesAsesino(){
        int Puñalada=AtaqueRandomBasico();
        int AluvionDeAcero=AtaqueRandomBajo();
        int Desgarrar=AtaqueRandomMedio();
        int AtaqueEspecial=GolpeSombrio();
    }
    public int getDañoAsesino(){
       return this.dañoAsesino=dañoAsesino;
    }
    public int getSaludAsesino(){
       return this.saludAsesino=saludAsesino;
    }
        public  int verSalud(){
        System.out.println(saludAsesino);
        return saludAsesino;
    } 
    }    
        
    

