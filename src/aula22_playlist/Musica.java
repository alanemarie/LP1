/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22_playlist;

/**
 *
 * @author alanelima
 */
public class Musica {
    
    //ATRIBUTOS
    private String nomeDaMusica;
    private String artista;
    private String genero;
    private int ano;
  
    
    //CONSTRUTOR
    public Musica(String nomeDaMusica, String artista, String genero, int ano) {
        //this.nomeDaMusica = nomeDaMusica;
        setNomeDaMusica(nomeDaMusica);
        
        //this.artista = artista;
        setArtista(artista);
        
        //this.genero = genero;
        setGenero(genero);
        
        //this.ano = ano;
        setAno(ano);
    }
   
    
    //MÉTODOS
    
    //setters
    public void setNomeDaMusica(String nomeDaMusica){
        this.nomeDaMusica = nomeDaMusica;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    //getters
    public String getNomeDaMusica(){
        return this.nomeDaMusica;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getAno(){
        return this.ano;
    }
}
