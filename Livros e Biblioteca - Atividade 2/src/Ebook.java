/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
public class Ebook extends Livro {
    private double tamanhoArquivo;
    
     public Ebook(String titulo, String autor, int numeroPagina, double tamanhoArquivo){
        super (titulo, autor, numeroPagina);
        this.tamanhoArquivo = tamanhoArquivo;
    }
     
    public double tamanhoArquivo(){
        return tamanhoArquivo;
    }
    
    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    public void descricao(){
        System.out.println("Ebook: " +getTitulo());
        System.out.println("Autor: " +getAutor());
        System.out.println("Numero de Paginas: " +getNumeroPagina());
        System.out.println("Tamanho do Arquivo: " +tamanhoArquivo());
    }
    
}
