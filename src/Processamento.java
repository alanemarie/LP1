public class Processamento {

    double mediasAcumuladas;

    //preparação (inicialização da variável mediasAcumuladas)
    public void initMediasAcumuladas(){
        this.mediasAcumuladas = 0.0;
    }

    //setter (atualização do valor de mediasAcumuladas)
    public void setMediasAcumuladas(double mediaBimestral){
        this.mediasAcumuladas += mediaBimestral;
    }

    //getter (obtenção do valor de mediasAcumuladas)
    public double getMediasAcumuladas(){
        return this.mediasAcumuladas;
    }

    public double calcularMedia(){
        return this.mediasAcumuladas/4.0;
    }

    public double calcularFaltas(int cargaHoraria, int faltas){
        double porcentagem = ((double) faltas/ (double) cargaHoraria) * 100.0;
        return porcentagem;
    }
}