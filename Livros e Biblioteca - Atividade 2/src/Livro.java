/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
public abstract class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int numeroPagina;
    
    //Construtor
    public Livro(String titulo, String autor, int numeroPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    
    //Metodos para obter/consultar valor
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNumeroPagina(){
        return numeroPagina;
    }
    
    //Metodo para definir/alterar valor
    public void setNumeroPagina(int numeroPagina){
        this.numeroPagina = numeroPagina;
    }
    
    //Metodo abstrato
    public abstract void descricao();
    
}
