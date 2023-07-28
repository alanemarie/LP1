import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alanelima
 */
public class Datas {
    
    //atributos
    Date dataDeHoje = new Date();
    Scanner teclado = new Scanner(System.in);
    
    //atributos - máscaras para data
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE, dd/MM/yyyy hh:mm:ss");
    //máscara que será utilizada para validação de data
    SimpleDateFormat filtroParaData = new SimpleDateFormat("dd/MM/yyyy");
    
    
    //métodos
    public void testarFuncoes(){
        System.out.println(dataDeHoje);
        String dataDeHojeFormatada = sdf.format(dataDeHoje);
        System.out.println("Data formatada: "+dataDeHojeFormatada);
        dataDeHojeFormatada = sdf2.format(dataDeHoje);
        System.out.println("Nova data formatada: "+dataDeHojeFormatada);
        dataDeHojeFormatada = sdf3.format(dataDeHoje);
        System.out.println("Data com dia da semana: "+dataDeHojeFormatada);
    }
    
    public Date validarData(String data){
        try {
            //converter String para Date
            Date stringConvertida = filtroParaData.parse(data);
            return stringConvertida;
        } catch (ParseException ex) {
            System.out.println("A data que você digitou é inválida!");
            System.out.println("Digite uma data no formato dia/mês/ano.");
            System.out.println("(dia com 2 dígitos, mês com 2 dígitos, ano com 4 dígitos).");
            return null;
        }
    }
        
        public Date lerData(String mensagem){
            Date data = null;
            
            while(true){
                
                System.out.println(mensagem);
                
                //leitura de data na tela
                String stringData = teclado.nextLine();
                
                //validação da data lida acima e salvamento em Date data
                data = validarData(stringData);
                
                if(data != null)
                    break;
                else
                    teclado = new Scanner(System.in);
            }
            
            return data;
        }
}
