public class Processamento {

    public double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        return (nota1 + nota2 + nota3 + nota4)/4.0;
    }

    public double calcularFaltas(int cargaHoraria, int faltas){
        double porcentagem = ((double) faltas/ (double) cargaHoraria) * 100.0;
        return porcentagem;
    }
}




