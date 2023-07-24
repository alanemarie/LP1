public class Main {
    public static void main(String args[]){
        Entrada entrada = new Entrada();
        int a = entrada.lerNumeroInteiro("Digite o valor do primeiro número:");
        int b = entrada.lerNumeroInteiro("Digite o valor do segundo número:");
        int c = entrada.lerNumeroInteiro("Digite o valor do terceiro número:");

        Processamento processamento = new Processamento();
        int soma = processamento.somarNumeros(a, b, c);

        Saida saida = new Saida();
        saida.exibirSoma(soma);
    }
}


