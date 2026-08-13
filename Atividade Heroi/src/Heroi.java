/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
public class Heroi {
    private String nome;
    private int vida;
    private int energia;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int vida(){
        return vida;
    }
    
    public int energia(){
        return energia;
    }
    
    public void apresentar() {
        System.out.println("Sou um heroi, e meu nome e " + nome + " , eu tenho " + vida + "% de vida, " + energia + "% de energia");
    }
    
    public void atacar() {
        System.out.println("O Heroi está atacando!");
    }
}
