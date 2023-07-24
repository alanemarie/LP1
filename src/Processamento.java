public class Processamento {
    int soma; //acumuladora de valores


    //inicializar o atributo soma
    public void initSoma(){
        this.soma = 0;
    }

    //setter da soma
    public void setSoma(int valor){
        this.soma += valor;
    }

    //getter da soma
    public int getSoma(){
        return this.soma;
    }
}

