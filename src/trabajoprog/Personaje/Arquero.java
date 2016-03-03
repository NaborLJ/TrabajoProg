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
public class Arquero {
    int salud=570;
    int precision=500;
     public int FlechaNegra(){
        //consume 75% mana 
        return (int) (Math.random()*(180-220)+1);
    }
    public int ProyectilLetal(){
        //consume 55% mana 
        return (int) (Math.random()*(150-170)+1);
    }
    public int FlechaMortal(){
        //consume 90% Ataque curativo total 
        return (int) (Math.random()*(200-500));
    }
     public int AtaqueRandomBasico(){
     return (int) (Math.random()*(40-60)+1);
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        return (int) (Math.random()*(30-80)+1);
    }
    public int AtaqueRandomMedio(){
      return (int) (Math.random()*(90-120)+1);
    }
    public void AtaquesMago(){
        int DisparoFirme=AtaqueRandomBasico();
        int FuegoRapido=AtaqueRandomBajo();
        int LluviaDeFlechas=AtaqueRandomMedio();
        int AtaqueEspecial=FlechaNegra();
        
        
    }
}
