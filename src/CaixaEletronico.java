public class CaixaEletronico {
    /*Faça um programa que simule um caixa eletrônico 
    com as opções de saque, depósito e consulta de saldo. O usuário 
    deve realizar essas operações até decidir sair do programa.*/

    //atributos
    double saldo;  //this.saldo
    Entrada entrada = new Entrada();

    //metodos

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é igual a "+this.saldo);
    }

    public void sacar(double quantia){
        if (this.saldo >= quantia){
            this.saldo -= quantia; 
            consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente para realização de saque!");
        }
    }

    public void depositar(double quantia){
        this.saldo += quantia;
        consultarSaldo();
    }


    public void menu() {
        //exibir na tela uma mensagem de boas vindas
        System.out.println("********* Bem-vindo ao banco LP! *********");

        do {
            //exibir as opções
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Encerrar sessão");

            //pessoa seleciona opção
            int opcao = entrada.lerOpcao("--- Selecione uma das opções acima. ---");
            double quantia;

            //menu executa ação selecionada
            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2: 
                    quantia = entrada.lerQuantiaEmDinheiro("Quanto deseja sacar?");
                    sacar(quantia);
                    break;
                case 3:
                    quantia = entrada.lerQuantiaEmDinheiro("Quanto deseja depositar?");
                    depositar(quantia);
                    break;
                case 4:
                    //condição de parada
                    System.out.println("Obrigada por usar o banco LP!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("Digite uma das opções (1, 2, 3 ou 4).");
                    break;
            }

            if (opcao == 4)
                break;
        } while (true);
    }
}