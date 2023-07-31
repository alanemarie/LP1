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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criando a playlist (vetor de músicas)
        Musica[] playlist = new Musica[25];
        Musica[][] tabelaDeMusicas = new Musica[2][2];
        
        //adicionando músicas na playlist ------------
        
        
        //FORMA 3 -- sem usar construtor
        
        //primeiro, criar o objeto que será adicionado
        /*Musica m1 = new Musica();
        m1.setNomeDaMusica("New Rules");
        m1.setArtista("Dua Lipa");
        m1.setGenero("Pop");
        m1.setAno(2017);
        
        //aí sim adicionar o objeto criado na playlist
        playlist[0] = m1;*/
        
        //FORMA 1 -- usando construtor
        playlist[0] = new Musica("Barbie Girl", "Aqua", "Pop", 1997);
        playlist[1] = new Musica("New Rules", "Dua Lipa", "Pop", 2017);
        playlist[2] = new Musica("Bem que se quis", "Marisa Monte", "MPB", 1989);
        playlist[3] = new Musica("Shout", "Tears for Fears", "Synthpop", 1984);
        
        //FORMA 2 - uusando construtor
        Musica m5 = new Musica("Anunciação", "Alceu Valença", "MPB", 1983);
        playlist[4] = m5;
        
        for(int i=0; i<= playlist.length-1; i++){            
            if(playlist[i] != null){
                System.out.println(playlist[i].getNomeDaMusica()+", "+
                playlist[i].getArtista()+", "+playlist[i].getGenero()+", "
                +playlist[i].getAno());
            }
        }
        
        /////////////////////////////////////////////////

        System.out.println("Criando matriz de músicas: ");
        
        tabelaDeMusicas[0][0] = new Musica("teste", "artistaTeste", "generoTeste", 2023);
        tabelaDeMusicas[0][1] = new Musica("teste2", "artistaTeste2", "generoTeste", 2023);
        tabelaDeMusicas[1][0] = new Musica("teste3", "artistaTeste3", "generoTeste", 2023);
        tabelaDeMusicas[1][1] = new Musica("teste4", "artistaTeste4", "generoTeste", 2023);
        
        for(int linha=0; linha<=tabelaDeMusicas.length-1; linha++){
            for(int coluna=0; coluna <= tabelaDeMusicas[linha].length-1; coluna++){
                if(tabelaDeMusicas[linha][coluna] != null){
                System.out.println(tabelaDeMusicas[linha][coluna].getNomeDaMusica()+", "+
                tabelaDeMusicas[linha][coluna].getArtista()+", "+tabelaDeMusicas[linha][coluna].getGenero()+", "
                +tabelaDeMusicas[linha][coluna].getAno());
                }
            }
        }
    }
    
}
