import java.util.Scanner;

public class Entrada {
    Scanner teclado = new Scanner(System.in);

    public int lerPalpite(String mensagem){
        int palpite = 0;

        while(true){
            try {
                System.out.println(mensagem);
                palpite = teclado.nextInt();
                if (palpite <= 100 && palpite >= 1)
                    break;
                else {
                    System.out.println("Erro! Digite um número entre 1 e 100");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um número inteiro.");
                teclado = new Scanner(System.in);
            }
        }

        return palpite;
    }
}
