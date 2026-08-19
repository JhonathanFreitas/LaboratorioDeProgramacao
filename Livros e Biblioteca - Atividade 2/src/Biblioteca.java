/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */

import java.util.ArrayList;
        
public class Biblioteca {
    
    private ArrayList<Livro> livros;
    
    public Biblioteca(){
        this.livros = new ArrayList();
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso");
    }
    
    public void listarLivros() {
        if(livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado");
        } else {
            for (Livro livro : livros) {
                livro.descricao();
                System.out.println("--");
            }
        }
    }
    
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if( livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        
        return null;
    }
    
}
