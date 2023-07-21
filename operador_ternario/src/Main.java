import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        //condicional com if comum
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        //operador ternário
        //(condicao) ? "SIM" : "NAO"
        String mensagem = (idade >= 18) ? "Maior de idade!" : "Menor de idade!";
        System.out.println(mensagem);

        //------------------------------------------------------------------------

        Boolean simNao = true;

        //condicional com if comum
        if (simNao == true) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        mensagem = (simNao == true) ? "VERDADEIRO" : "FALSO";
        System.out.println(mensagem);

        teclado.close();
    }
}