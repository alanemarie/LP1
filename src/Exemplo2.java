import java.util.Scanner;

public class Exemplo2 {
    public void exibirExemplo(){
        Scanner teclado = new Scanner(System.in);

        char resposta = 'n';
        //System.out.println("[WHILE] Gostaria de digitar um número?");
        //char resposta = teclado.next().charAt(0);
        while (resposta == 's'){
            System.out.println("[WHILE] Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("[WHILE] O número digitado foi "+numero);

            //atualização da variável de controle da repetição
            System.out.println("[WHILE] Gostaria de digitar um novo número?");
            resposta = teclado.next().charAt(0);
        }

        //////////////////////////////////////
        char resposta2 = 'n';
        do {
            System.out.println("[DO-WHILE] Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("[DO-WHILE] O número digitado foi "+numero);

            //atualização da variável de controle da repetição
            System.out.println("[DO-WHILE] Gostaria de digitar um novo número?");
            resposta2 = teclado.next().charAt(0);
        } while (resposta2 == 's');

        teclado.close();
    }
}
