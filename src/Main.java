public class Main {
    public static void main(String args[]){
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        int i;
        processamento.initSoma();

        for (i = 1; i <= 10; i++) {
            String mensagem = "Digite o valor do "+i+"º número:";
            int temp = entrada.lerNumeroInteiro(mensagem);
            processamento.setSoma(temp);
        }

        int soma = processamento.getSoma();
        saida.exibirSoma(soma);
    }
}


