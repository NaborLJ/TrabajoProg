/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Batalla;

import trabajoprog.Personaje.Asesino;

/**
 *
 * @author Usuario
 */
public class HacerDaño {
    Asesino jug1 = new  Asesino();
    Asesino jug2 = new Asesino();
   
    
    public void golpePrueba(){
       int hp=jug1.getSaludAsesino();
       int hp2=jug2.getSaludAsesino();
       int daño=jug1.GolpeSombrio();
       int daño2=jug1.BrechaNegra();
       int daño3=jug1.DanzaDeLaMuerte();
        int resultado;
            System.out.println(hp2);
            hp2= hp2+daño;
            System.out.println(hp2);
            hp2=hp2+daño2;
            System.out.println(hp2);
            hp2=hp2+daño3;
            
            
       
    }
}
