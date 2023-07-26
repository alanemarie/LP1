import java.util.Random;

public class Adivinhacao {
    //atributos do Exercicio1
    Random sorteador = new Random();
    Entrada entrada = new Entrada();
    int numeroSorteado;
    int palpite;
    int tentativas;

    public void initParametros(){
        this.numeroSorteado = sorteador.nextInt(100) + 1;
        this.tentativas = 0;
    }

    public void jogoDaAdivinhacao(){

        initParametros();

        System.out.println("Bem-vindo(a) ao jogo da adivinhação!");
        System.out.println("---- Seu objetivo é adivinhar um número entre 1 e 100 sorteado pelo computador. ----");
        System.out.println("---- BOA SORTE! ----");

        System.out.println("Teste: numero sorteado = "+numeroSorteado);

        do {
            int palpite = entrada.lerPalpite("Digite um número entre 1 e 100: ");
            tentativas++;

            if (palpite > numeroSorteado)
                System.out.println("Você errou! Tente um número menor.");
            else if (palpite < numeroSorteado)
                System.out.println("Você errou! Tente um número maior.");
            else {
                System.out.println("Parabéns! Você acertou em "+tentativas+" palpites.");
                break;
            }
        } while (true);
    }

}
