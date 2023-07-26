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

    public int lerOpcao(String mensagem){
        int opcao = 0;

        while(true){
            try {
                System.out.println(mensagem);
                opcao = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Opção inválida!");
                teclado = new Scanner(System.in);
            }
        }

        return opcao;
    }

    public double lerQuantiaEmDinheiro(String mensagem){
        double quantia = 0;

        while(true){
            try {
                System.out.println(mensagem);
                quantia = teclado.nextDouble();
                if (quantia >= 0) 
                    break;
                else {
                    System.out.println("Quantia inválida!");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor numérico.");
                teclado = new Scanner(System.in);
            }
        }

        return quantia;
    }

}
