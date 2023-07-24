import java.text.DecimalFormat;

public class Saida {
    public String exibirResultado(double mediaAnual, double porcFaltas){

        DecimalFormat df = new DecimalFormat("#0.0");
        System.out.println("A média anual é "+df.format(mediaAnual));
        System.out.println("A porcentagem de faltas é "+df.format(porcFaltas)+"%.");
        
        String resultado;

        if (mediaAnual >= 6.0 && porcFaltas <= 25.0){
            resultado = "APR";
        } else {
            resultado = (mediaAnual < 6.0) ? "RPN" : "RPF";
        }

        return resultado;
    }
    
}
