package aula24_listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alanelima
 */
public class Main {

    public static void main(String[] args) {
        Livro livroA = new Livro("O corvo", "Edgar Allan Poe", "terror");
        Livro livroB = new Livro("A revolução dos bichos", "George Orwell", "sátira");
        
        //vetor de livros estático (tamanho fixo)
        Livro[] livros = new Livro[3];
        livros[0] = livroA;
        livros[1] = livroB;
        
        //System.out.println(livros[0]);
        //System.out.println(livros[1]);
        
        //////////////////////////////////////////
        
        //"vetor" de livros dinâmico
        List<Livro> listaDeLeitura = new ArrayList<>();
        
        //criando livros para adicionar na lista
        Livro livro1 = new Livro("Anne de Green Gables", "Lucy Montgomery",
                "drama/aventura");
        Livro livro2 = new Livro("Anne de Avonlea", "Lucy Montgomery", 
        "drama/aventura");
        Livro livro3 = new Livro("Título", "Fulano", "gênero");
        Livro livro4 = new Livro("teste", "Fulano de Tal", "gênero teste");
        
        //adicionando livros na lista
        listaDeLeitura.add(livro1);
        listaDeLeitura.add(livro2);
        listaDeLeitura.add(livro3);
        listaDeLeitura.add(livro4);
        
        //removendo algum livro da lista
        listaDeLeitura.remove(livro3);
        
        //exibindo os dados da lista de livros
        for (int i=0; i<listaDeLeitura.size(); i++){
            System.out.println(listaDeLeitura.get(i));
        }
        
        //buscando dados na lista
        String tituloASerBuscado = "teste";
        char encontrou = 'n';
        
        for (int i=0; i<listaDeLeitura.size(); i++){
            Livro atualNaLista = listaDeLeitura.get(i);
            String tituloDoLivroAtualNaLista = atualNaLista.getNome();
            if (tituloDoLivroAtualNaLista.equals(tituloASerBuscado)){
                System.out.println("Livro encontrado na posição "+(i+1)+" da lista!");
                encontrou = 's';
                break;
            }
        }
        if (encontrou == 'n')
            System.out.println("Livro "+tituloASerBuscado+" não encontrado.");

        //--------atualizando as informações de um livro na lista
        livro4.setAutor("Fulano de Tal");
        //      obtendo a posição do livro que será atualizado
        int indiceLivroAtualizado = listaDeLeitura.indexOf(livro4);

        listaDeLeitura.set(indiceLivroAtualizado, livro4);
    }
    
}
