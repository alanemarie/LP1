import java.util.List;

public class UI {

    int opcao;
    Controle controle = new Controle();

    public UI(){

        while(opcao != 9){
            System.out.println("1 - Adicionar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar");
            System.out.println("9 - Sair");

            Entrada entrada = new Entrada();
            opcao = entrada.lerInteiro("Digite o número correspondente a ação desejada: ");

            switch(opcao){
                case 1:
                    telaAdicionar();
                    break;
                case 2:
                    telaBuscar();
                    break;
                case 3:
                    telaAlterar();
                    break;
                case 4:
                    telaExcluir();
                    break;
                case 5:
                    telaListar();
                    break;
                case 9: 
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void telaAdicionar(){
        Entrada entrada = new Entrada();
        int id = entrada.lerInteiro("Digite o id do produto: ");
        Produto produto = controle.buscar(id);

        if(produto == null){ //não encontrou o produto!
            produto = new Produto();
            produto.setId(id);
            produto.setNome(entrada.lerString("Digite o nome do produto: "));
            produto.setPeso(entrada.lerDouble("Digite o peso do produto: "));
            produto.setPrecoPorKilo(entrada.lerDouble("Digite o preço por kilo do produto: "));
            produto.setDataDeCadastro(entrada.lerData("Digite a data de cadastro: "));
            produto.calcularPrecoTotal();
            controle.adicionar(produto);
        } else {
            System.out.println("Este produto já está cadastrado.");
        }
    }

    public void telaBuscar(){
        Entrada entrada = new Entrada();
        int id = entrada.lerInteiro("Digite o id do produto: ");
        Produto produto = controle.buscar(id);

        if (produto == null)
            System.out.println("Produto não cadastrado.");
        else 
            System.out.println(produto); //exibe infos do produto
    }

    public void telaAlterar(){
        Entrada entrada = new Entrada();
        int id = entrada.lerInteiro("Digite o id do produto: ");
        Produto produto = controle.buscar(id);

        if (produto == null){
            System.out.println("Produto não cadastrado.");
        } else {

            System.out.println("Dados atuais: ");
            System.out.println(produto);

            Produto modificado = produto;
            modificado.setId(produto.getId());
            modificado.setNome(entrada.lerString("Digite o nome do produto: "));
            modificado.setPeso(entrada.lerDouble("Digite o peso do produto: "));
            modificado.setPrecoPorKilo(entrada.lerDouble("Digite o preço por kilo do produto: "));
            modificado.setDataDeCadastro(entrada.lerData("Digite a data de cadastro: "));
            modificado.calcularPrecoTotal();

            controle.atualizar(produto, modificado);

            System.out.println("Dados atualizados.");
        }
    }

    public void telaExcluir(){
        Entrada entrada = new Entrada();
        int id = entrada.lerInteiro("Digite o id do produto: ");
        Produto produto = controle.buscar(id);

        if(produto == null){
            System.out.println("Produto não cadastrado.");
        } else {
            System.out.println("Removendo... "+produto);
            controle.excluir(produto);
        }
    }

    public void telaListar(){
        List<Produto> lista = controle.listar();

        if(lista.size() == 0)
            System.out.println("Lista vazia!");
        else {
            for (int i=0; i<lista.size(); i++){
                System.out.println(lista.get(i).toString());
            }
        }
    }

}
