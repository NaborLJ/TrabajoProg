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
public class GuardaBosques {
    int salud=570;
    int enfoque=500;
     public int FlechaVenenosa(){
        //consume 75% mana 
         if(enfoque>375){
           this.enfoque=enfoque-375;
        return (int) (Math.random()*(180-220)+1);
    }else
        System.out.println("¡No hay suficiente energia! Energía actual: "+enfoque);
        return 0;
}
    public int DisparoPenetrante(){
        //consume 55% mana 
        if(enfoque>275){
        return (int) (Math.random()*(150-170)+1);
    }
        else
        System.out.println("¡No hay suficiente precisión! Precisión actual: "+enfoque);
        return 0;
    }
    public int FlechaMortal(){
        //consume 65% Ataque curativo total 
        if(enfoque>325 && salud>150){
        return (int) (Math.random()*(200-500));
    }else
        System.out.println("¡No hay suficiente enfoque! Enfoque actual: "+enfoque);
        return 0;
    }
    public int Vendaje(){
        int aux_cura;
        if(enfoque>275 && salud<570){
            aux_cura=(int)(Math.random()*(100-200));
            salud=aux_cura+salud;
            return salud;
        }else
            if(enfoque<275)
                System.out.println("¡No hay suficiente enfoque! Enofque actual : "+enfoque);
            else if(salud>570)
                System.out.println("¡No puedes curarte ahora! Salud actual demasiado alta :"+salud);
            return 0;
        
    }
     public int AtaqueRandomBasico(){
     return (int) (Math.random()*(40-60)+1);
    }
    //O ataque defensivo/bloqueo ataque
    public int AtaqueRandomBajo(){
        if(enfoque>40){
        return (int) (Math.random()*(30-80)+1);
        }else
        System.out.println("¡No hay suficiente enfoque! Enfoque actual: "+enfoque);
        return 0;
    }
    public int AtaqueRandomMedio(){
        if(enfoque>60){
      return (int) (Math.random()*(70-140)+1);
    }else
        System.out.println("¡No hay suficiente enfoque! Enfoque actual: "+enfoque);
        return 0;
    }
    public void AtaquesArquero(){
        int DisparoFirme=AtaqueRandomBasico();
        int FuegoRapido=AtaqueRandomBajo();
        int LluviaDeFlechas=AtaqueRandomMedio();
        int AtaqueEspecial=FlechaVenenosa();
        
    }

    public GuardaBosques() {
    }

    public GuardaBosques(int salud,int enfoque) {
        this.enfoque=enfoque;
        this.salud=salud;
    }
    
    public int getSalud() {
        return this.salud=salud;
    }

    public int getEnfoque() {
        return this.enfoque=enfoque;
    }

    
    
}
