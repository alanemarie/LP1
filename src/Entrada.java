import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Entrada {

    Scanner teclado = new Scanner(System.in);


    //ler inteiro
    public int lerInteiro(String mensagem){
        int opcao;

        while(true){
            try {
                System.out.println(mensagem);
                opcao = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro.");
                teclado = new Scanner(System.in);
            }
        }

        return opcao;
    }

///////////////////////////////////////

    //ler strings
    public String lerString(String mensagem){
        String s = "";

        while(true){
            System.out.print(mensagem);
            teclado.nextLine();
            s = teclado.nextLine();
            
            if(s != null){
                break;
            } else {
                System.out.println("Digite valor não-nulo! ");
                teclado = new Scanner(System.in);
            }
        }

        return s;
    }

    ///////////////////////////////////////

    //ler datas no formato dd/mm/aaaa
    public Date lerData(String mensagem){
        Date s;

        while(true){

            try {
                System.out.println(mensagem);
                String sData = teclado.nextLine();                

                if(sData != null){
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    s = sdf.parse(sData);
                    break;
                } else {
                    System.out.println("Digite data não-nula! ");
                    teclado = new Scanner(System.in);
                }
            } catch (ParseException e) {
                System.out.println("A data deve estar no formato dd/MM/yyyy!");
                teclado = new Scanner(System.in);
            }

            
        }

        return s;
    }

    ///////////////////////////////////////

    //ler médias (double entre 0.0 e 10.0)
    public double lerDouble(String mensagem){
        double peso;

        while(true){

            try {
                System.out.println(mensagem);
                peso = teclado.nextDouble();
                if(peso >= 0.0)
                    break;
                else {
                    System.out.println("Digite valor acima de zero! ");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor decimal.");
                teclado = new Scanner(System.in);
            }
        }

        return peso;
    }

    

}
