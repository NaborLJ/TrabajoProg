/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprog.Personaje;

/**
 *
 * @author nlopezjimenez
 */
public class Mago {
    int salud=550;
    int mana=600;
    
     public int TenazaInfernal(){
        //consume 75% mana 
        return (int) (Math.random()*(170-220)+1);
    }
    public int MagmaLiquido(){
        //consume 55% mana 
        return (int) (Math.random()*(150-170)+1);
    }
    public int Resurgimiento(){
        //consume 90% Ataque curativo total 
        return (int) (Math.random()*(400-500));
    }
     public int AtaqueRandomBasico(){
     return (int) (Math.random()*(20-60)+1);
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        return (int) (Math.random()*(61-80)+1);
    }
    public int AtaqueRandomMedio(){
      return (int) (Math.random()*(80-120)+1);
    }
    public void AtaquesMago(){
        int DañoElemental=AtaqueRandomBasico();
        int DetonacionIgnea=AtaqueRandomBajo();
        int OrbeAracano=AtaqueRandomMedio();
        int AtaqueEspecial=TenazaInfernal();
        
        
    }
}
