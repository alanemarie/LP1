import java.util.Scanner;

public class Entrada {
    Scanner teclado = new Scanner(System.in);

    public int lerNumeroInteiro(String mensagem){
        int a = 0;
        while(true){
            try{
                System.out.println(mensagem);
                a = teclado.nextInt();
                if (a >= 0)
                    break;
                else {
                    System.out.println("Digite um número positivo (maior ou igual a zero)!");
                    teclado = new Scanner(System.in);
                }

            }catch(Exception e){
                System.out.println("Erro! Digite um número inteiro!");
                teclado = new Scanner(System.in);
            }
        }
        return a;
    }
}



