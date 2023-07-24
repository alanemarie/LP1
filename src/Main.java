public class Main {
    public static void main(String args[]){
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        int n = entrada.lerNumeroInteiro("Digite quantos números inteiros deseja somar: ");

        //preparação para entrar na repetição
        int i;
        processamento.initSoma();
        //

        for (i = 1; i <= n; i++) {
            String mensagem = "Digite o valor do "+i+"º número:";
            int temp = entrada.lerNumeroInteiro(mensagem);
            processamento.setSoma(temp);
        }

        int soma = processamento.getSoma();
        double media = processamento.getMedia(n);
        saida.exibirSoma(soma);
        saida.exibirMedia(media);
    }
}


