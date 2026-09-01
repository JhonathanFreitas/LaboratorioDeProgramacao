/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

public class Principal {

    public static void main(String[] args) {
        // Criação dos objetos.
        Cachorro cachorro = new Cachorro("Rex", 5, "Marrom");
        Gato gato = new Gato("Mimi", 3, "Branco");
        Cavalo cavalo = new Cavalo("Spirit", 7, "Preto");
        Coelho coelho = new Coelho("Pernalonga", 2, "Cinza");

        // Criação do veterinário e inclusão dos animais para atendimento.
        Veterinario veterinario = new Veterinario();

        veterinario.adicionarAnimal(cachorro);
        veterinario.adicionarAnimal(gato);
        veterinario.adicionarAnimal(cavalo);
        veterinario.adicionarAnimal(coelho);

        System.out.println("SONS DOS ANIMAIS");
        veterinario.atenderAnimais();

        // Exibe todos os animais adicionados na carrocinha.
        veterinario.listarCarrocinha();

        // Modifica o tipo de som do cachorro e chama o método novamente.
        System.out.println("\nSOM MODIFICADO");
        cachorro.setSom("Woof");
        cachorro.emitirSom();
    }
}
