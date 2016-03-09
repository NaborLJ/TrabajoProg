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
    int energiaAsesino=550;
    int dañoAsesino;
    private Random rand = new Random(System.nanoTime());
    GuardaBosques obxGuarda = new GuardaBosques();
    
    public int GolpeSombrio(int dañoAsesino){
        //consume 60% mana 
         if(energiaAsesino>330){
             
             this.energiaAsesino=energiaAsesino-330;
            dañoAsesino=(int) (Math.random()*(200-300));
             return dañoAsesino;
         }
     else
        System.out.println("¡No hay suficiente energia! Energía actual: "+energiaAsesino);
        return 0;
     }
     
    public int BrechaNegra(int dañoAsesino){
        //consume 30% mana 
        if(energiaAsesino>165){
        this.energiaAsesino=energiaAsesino-165;
        dañoAsesino=(int) (Math.random()*(200-300));
        return dañoAsesino;
        }else
            System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
        }
        
    public int DanzaDeLaMuerte(int dañoAsesino){
        //consume 80% Ataque curativo total 
        if(energiaAsesino>440){
        this.energiaAsesino=energiaAsesino-440;
        dañoAsesino=(int) (Math.random()*(200-300));
        return dañoAsesino;
    }else
          System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
         return 0;
    }
        
     public int AtaqueRandomBasico(int dañoAsesino){
     dañoAsesino=(int) (Math.random()*(30-60)+1);
     return dañoAsesino;
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(int dañoAsesino){
        if(energiaAsesino>40){
        this.energiaAsesino=energiaAsesino-40;
        dañoAsesino=(int) (Math.random()*(68-80)+1);
        return dañoAsesino;
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
}
    public int AtaqueRandomMedio(int dañoAsesino){
        if(energiaAsesino>60){
            this.energiaAsesino=energiaAsesino-60;
        dañoAsesino= (int) (Math.random()*(87-120)+1);
        return dañoAsesino;
    }else
        System.out.println("¡No hay suficiente energía! Energía actual "+energiaAsesino);
        return 0;
}
    public void AtaquesAsesino(int dañoAsesino){
        int Puñalada=AtaqueRandomBasico(dañoAsesino);
        int AluvionDeAcero=AtaqueRandomBajo(dañoAsesino);
        int Desgarrar=AtaqueRandomMedio(dañoAsesino);
        int AtaqueEspecial=GolpeSombrio(dañoAsesino);
    }
    public int getDañoAsesino(){
       return dañoAsesino=dañoAsesino;
    }
    public int getSaludAsesino(){
       return salud=salud;
    }
        public  int verSalud(){
        System.out.println(salud);
        return salud;
    } 
        public int doDamage(int dañoAsesino){
          salud=salud-dañoAsesino;
          return salud;
        }
        public int reducirVida(int salud, GuardaBosques obxGuarda){
            int daño1;
            int dañoGuarda;
            dañoGuarda=obxGuarda.AtaqueRandomBajo();
            daño1=obxGuarda.doDamage(dañoGuarda);
           salud=salud+daño1;
                return salud;
        }
    }    
        
    

