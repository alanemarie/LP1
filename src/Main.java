public class Main {
    public static void main(String args[]){
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        char resposta;
        int cargaHoraria = entrada.lerHorasAula("Digite a carga horária da disciplina: ");

        do {

            resposta = entrada.lerCaracter("Deseja inserir a nota de um aluno? Digite sim/nao apenas.");

            if (resposta == 's'){

                String nome = entrada.lerString("Digite o nome do aluno ou aluna:");
                processamento.initMediasAcumuladas();

                for (int i=0; i<4; i++){
                    String mensagem = "Digite a nota do "+(i+1)+"º bimestre";
                    double temp = entrada.lerNotaBimestral(mensagem);
                    processamento.setMediasAcumuladas(temp);
                }
                int faltas = entrada.lerFaltas("Digite a quantidade de faltas: ", cargaHoraria);
            
                double media = processamento.calcularMedia();
                double porcFaltas = processamento.calcularFaltas(cargaHoraria, faltas);

                String resultado = saida.exibirResultado(media,porcFaltas);
                System.out.println("A situação de "+nome+" na disciplina é "+resultado);

            }
        } while (resposta == 's');        
    }
}