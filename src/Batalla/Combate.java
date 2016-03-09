/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Batalla;

import javax.swing.JOptionPane;
import trabajoprog.Personaje.Asesino;
import trabajoprog.Personaje.GuardaBosques;

/**
 *
 * @author nlopezjimenez
 */
public class Combate {
    Asesino jug1 = new Asesino();
    GuardaBosques jug2 = new GuardaBosques();
    boolean juga1= true;
    boolean juga2=false;
    public void DañoJugador1(){
    int op;
    do{
        op=Integer.parseInt(JOptionPane.showInputDialog(" 1.-Golpe Basico \n 2.-Golpe daño bajo  \n 3.-Golpe daño medio \n 4.-Danza de la Muerte"));
    switch(op){
        case 1 :
            jug1.reducirVida(op, jug2);
            System.out.println(jug1.verSalud());
            juga1=false;
            juga2=true;
            break;
    }
        
}while(juga1=true );
}
    }