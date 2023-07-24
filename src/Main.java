public class Main {
    public static void main(String args[]){
        Entrada entrada = new Entrada();

        double nota1 = entrada.lerNotaBimestral("Digite a nota do primeiro bimestre: ");
        double nota2 = entrada.lerNotaBimestral("Digite a nota do segundo bimestre: ");
        double nota3 = entrada.lerNotaBimestral("Digite a nota do terceiro bimestre: ");
        double nota4 = entrada.lerNotaBimestral("Digite a nota do quarto bimestre: ");

        int cargaHoraria = entrada.lerHorasAula("Digite a carga horária da disciplina: ");
        int faltas = entrada.lerFaltas("Digite a quantidade de faltas: ", cargaHoraria);

        Processamento processamento = new Processamento();
        double media = processamento.calcularMedia(nota1, nota2, nota3, nota4);
        double porcFaltas = processamento.calcularFaltas(cargaHoraria, faltas);

        Saida saida = new Saida();
        String resultado = saida.exibirResultado(media,porcFaltas);
        System.out.println("A sua situação na disciplina é "+resultado);
    }
}