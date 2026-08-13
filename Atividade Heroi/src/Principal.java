/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
public class Principal {
    public static void main(String[] args){
        Goku Goku = new Goku();
        Sonic Sonic = new Sonic();
        Mario Mario = new Mario();

        Goku.setNome("Goku");
        Goku.setVida(100);
        Goku.setEnergia(250);
        
        Goku.apresentar();
        Goku.atacar();
        
        Sonic.setNome("Sonic");
        Sonic.setVida(100);
        Sonic.setEnergia(500);
        
        Sonic.apresentar();
        Sonic.atacar();
        
        Mario.setNome("Mario");
        Mario.setVida(100);
        Mario.setEnergia(70);
        
        Mario.apresentar();
        Mario.atacar();
    }   
}
