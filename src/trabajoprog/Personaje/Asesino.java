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
public class Asesino {
    int salud=570;
    int energia=550;
    
     public int GolpeSombrio(){
        //consume 60% mana 
        return (int) (Math.random()*(170-180)+1);
    }
    public int BrechaNegra(){
        //consume 30% mana 
        return (int) (Math.random()*(120-130)+1);
    }
    public int DanzaDeLaMuerte(){
        //consume 80% Ataque curativo total 
        return (int) (Math.random()*(200-300));
    }
     public int AtaqueRandomBasico(){
     return (int) (Math.random()*(30-60)+1);
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        return (int) (Math.random()*(68-80)+1);
    }
    public int AtaqueRandomMedio(){
      return (int) (Math.random()*(87-120)+1);
    }
    public void AtaquesAsesino(){
        int Puñalada=AtaqueRandomBasico();
        int AluvionDeAcero=AtaqueRandomBajo();
        int Desgarrar=AtaqueRandomMedio();
        int AtaqueEspecial=GolpeSombrio();
        
        
    }
}
