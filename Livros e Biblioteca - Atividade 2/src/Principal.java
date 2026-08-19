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
        Biblioteca biblioteca = new Biblioteca();
        
        LivroFisico livroFisico = new LivroFisico(
                "Homem-Aranha: Tomada hostil",
                "David Liss",
                320,
                0.370
        );
        
        Ebook ebook = new Ebook(
                "A Metamorfose: DIE VERWANDLUNG",
                "Franz Kafka",
                96,
                0.180
        );
        
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        
        System.out.println("Livros da Biblioteca");
        biblioteca.listarLivros();
        
        System.out.println("Buscar por Titulo");
        
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Homem-Aranha: Tomada hostil");
        
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado");
            livroEncontrado.descricao();
        }else{
            System.out.println("Livro nao encontrado.");
        }
    }
}
