/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_vetoresmatrizes;

/**
 *
 * @author alanelima
 */
public class Main {
    
    public static void exemplosVetores(){
        String nome = "Nome SegundoNome PrimeiroSobrenome UltimoSobrenome";
        String[] vetorDePalavras = nome.split(" ");
        
        /*System.out.println("O conteúdo da posição 1 é "+vetorDePalavras[0]);
        System.out.println("O conteúdo da posição 2 é "+vetorDePalavras[1]);
        System.out.println("O conteúdo da posição 3 é "+vetorDePalavras[2]);*/
        
        for (int x=0; x <= vetorDePalavras.length-1; x++){
            System.out.println("O conteúdo da posição "+x+" é "+vetorDePalavras[x]);
        }
        
        /////////////////////////////////////
        
        //Criando vetor de 5 inteiros
        //Inicialmente não preenchido
        int[] vetorDeInteiros = new int[5];
        
        //Preenchendo com númeors de 1 a 5
        for (int i=0; i<= vetorDeInteiros.length-1; i++){
            vetorDeInteiros[i] = i+1;
        }
        
        //Acessando as posições do vetorDeInteiros
        for (int i=0; i<= vetorDeInteiros.length-1; i++){
            //System.out.println("A posição "+i+" do vetor contém o valor "+vetorDeInteiros[i]);
            System.out.println("vetorDeInteiros["+i+"] = "+vetorDeInteiros[i]);
        }
        
        //Alterando somente a posição de índice 2 do vetor 
        vetorDeInteiros[2] = 8;
        System.out.println("Valor atualizado do índice 2: "+vetorDeInteiros[2]);
    }

    public static void exemplosMatrizes(){
         //Criando matriz 4x4
        int[][] matrizDeInteiros = new int[4][4]; 
        
        //for para percorrer li8nhas
        for (int linha=0; linha <= matrizDeInteiros.length-1; linha++){
            //for para percorrer colunhas de UMA linha
            for (int coluna=0; coluna <= matrizDeInteiros[linha].length-1; coluna++){
                if (linha == coluna){
                    matrizDeInteiros[linha][coluna] = 1;
                } else {
                    matrizDeInteiros[linha][coluna] = 0;
                }
            }
        }
        
        System.out.println("Exibindo os valores da matriz de inteiros:");
        //for para percorrer a matriz
        for (int linha=0; linha <= matrizDeInteiros.length-1; linha++){
            for (int coluna=0; coluna <= matrizDeInteiros[linha].length-1; coluna++){
                System.out.print(matrizDeInteiros[linha][coluna]);
            }
            System.out.println("");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exemplosVetores();
        exemplosMatrizes();
    }
}
