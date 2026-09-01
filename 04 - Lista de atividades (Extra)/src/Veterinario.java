/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

import java.util.ArrayList;

// Classe responsável por receber os animais e adicioná-los na carrocinha.
public class Veterinario {
    private ArrayList<Animal> animais;
    private ArrayList<Animal> carrocinha;

    public Veterinario() {
        animais = new ArrayList<>();
        carrocinha = new ArrayList<>();
    }

    // Adiciona um animal na lista de atendimento do veterinário.
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    // Percorre a lista.
    public void atenderAnimais() {
        for (Animal animal : animais) {
            animal.emitirSom();
            carrocinha.add(animal);
        }
    }

    // Exibe os animais que foram adicionados na carrocinha.
    public void listarCarrocinha() {
        System.out.println("\nANIMAIS NA CARROCINHA");

        for (Animal animal : carrocinha) {
            System.out.println(
                    "Nome: " + animal.getNome() + " | Idade: " + animal.getIdade() + " | Cor: " + animal.getCor()
            );
        }
    }
}
