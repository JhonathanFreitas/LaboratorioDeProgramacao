/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

// Gato herda os atributos e métodos da classe Animal.
public class Gato extends Animal {

    public Gato(String nome, int idade, String cor) {
        super(nome, idade, cor, "Miau!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}
