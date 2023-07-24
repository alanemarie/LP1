import java.util.Scanner;

public class Entrada {
    Scanner teclado = new Scanner(System.in);

    public int lerNumeroInteiro(String mensagem){
        int a = 0;
        while(true){
            try{
                System.out.println(mensagem);
                a = teclado.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Erro! Digite um nümerro inteiro!");
                teclado = new Scanner(System.in);
            }
        }
        return a;
    }

     public double lerNumeroDouble(String mensagem){
        System.out.println(mensagem);
        double a = teclado.nextDouble();
        return a;
    }
}



