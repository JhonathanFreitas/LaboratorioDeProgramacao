/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

// Cavalo herda os atributos e métodos da classe Animal.
public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor, "Rooou!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}
