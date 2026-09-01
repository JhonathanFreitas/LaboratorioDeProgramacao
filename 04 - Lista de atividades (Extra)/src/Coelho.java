/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

// Coelho foi incluído porque também é solicitado no item 5 da atividade.
public class Coelho extends Animal {

    public Coelho(String nome, int idade, String cor) {
        super(nome, idade, cor, "Snif snif!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu o som: " + getSom());
    }
}
