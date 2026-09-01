/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

// Classe abstrata utilizada como base para todos os animais.
public abstract class Animal {
    private String nome;
    private int idade;
    private String cor;
    private String som;

    public Animal(String nome, int idade, String cor, String som) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String getSom() {
        return som;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Permite modificar o tipo de som emitido pelo animal.
    public void setSom(String som) {
        this.som = som;
    }

    // Cada subclasse deve implementar seu próprio modo de emitir o som.
    public abstract void emitirSom();
}
