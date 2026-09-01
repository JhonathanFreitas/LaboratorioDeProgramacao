/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

// Cachorro herda os atributos e métodos da classe Animal.
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String cor) {
        super(nome, idade, cor, "Au au!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}
