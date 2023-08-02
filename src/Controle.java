import java.util.ArrayList;
import java.util.List;

public class Controle {
    
    //estrutura para salvar vários produtos
    List<Produto> listaDeProdutos = new ArrayList<>();

    //adicionar um produto na lista de produtos
    public void adicionar(Produto produto){
        listaDeProdutos.add(produto);
    }

    //buscar um produto na lista de produtos a partir de seu id
    public Produto buscar(int id){
        for(int i=0; i<listaDeProdutos.size(); i++){
            if(id == listaDeProdutos.get(i).getId()){ //encontrou produto e já sai do FOR
                return listaDeProdutos.get(i);
            }
        }
        //se sair do FOR sem entrar NENHUMA VEZ NO IF, retorna objeto nulo
        return null;
    }

    //atualizar os valores de um produto
    public void atualizar(Produto atual, Produto modificado){
        //a função indexOf retorna a posição de um produto na lista
        listaDeProdutos.set(listaDeProdutos.indexOf(atual), modificado);
    }

    //retornar a lista de produtos
    public List<Produto> listar(){
        return listaDeProdutos;
    };

    //excluir um produto da lista
    public void excluir(Produto produto){
        listaDeProdutos.remove(produto);
    }

}
