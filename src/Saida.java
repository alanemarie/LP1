import java.text.DecimalFormat;

public class Saida {
    public void exibirSoma(int soma){
        System.out.println("O resultado da soma é "+soma);
    }

    public void exibirMedia(double media){
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("A média é igual a "+df.format(media));
    }
}

