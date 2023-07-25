public class Main {
    public static void main(String args[]){

        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        char resposta = 's'; //variável de controle da repetição

        int i = 1;
        processamento.initSoma();

        while (resposta == 's') {
            //passos principais da repetição
            String mensagem = "Digite o valor do "+i+"º número: ";
            int temp = entrada.lerNumeroInteiro(mensagem);
            processamento.setSoma(temp);
            i++;

            //atualização da variável de controle da repetição
            resposta = entrada.lerCaracter("Digite sim/nao para ler outro número."); 
        }

        int soma = processamento.getSoma();
        saida.exibirSoma(soma);
    }
}


