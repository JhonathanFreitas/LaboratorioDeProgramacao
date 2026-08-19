/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
public class LivroFisico extends Livro {
    private double peso;
    
    public LivroFisico(String titulo, String autor, int numeroPagina, double peso){
        //Chamar o construtor da classe livro
        super (titulo, autor, numeroPagina);
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }

    @Override
    public void descricao() {
        System.out.println("Livro Fisico: " +getTitulo());
        System.out.println("Autor: " +getAutor());
        System.out.println("Numero de Paginas: " +getNumeroPagina());
        System.out.println("Peso do livro: " +getPeso()+ "Kg");
    }   
}
