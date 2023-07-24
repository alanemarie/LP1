import java.util.Scanner;

public class Entrada {

    Scanner teclado = new Scanner(System.in);
    
    public double lerNotaBimestral(String mensagem){
        double nota = 0.0;

        while(true){
            try {
                System.out.println(mensagem);
                nota = teclado.nextDouble();
                if (nota >= 0.0 && nota <= 10.0){
                    break;
                } else {
                    System.out.println("A nota que você digitou é inválida!");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor decimal.");
                teclado = new Scanner(System.in);
            }
        }

        return nota;
    }

    public int lerHorasAula(String mensagem){
        int horasAula = 0;

        while(true){
            try {
                System.out.println(mensagem);
                horasAula = teclado.nextInt();
                if (horasAula > 0) {
                    break;
                } else {
                    System.out.println("A quantidade informada é inválida!");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um número inteiro.");
                teclado = new Scanner(System.in);
            }
        }

        return horasAula;
    }

    public int lerFaltas(String mensagem, int cargaHoraria){
        int faltas = 0;

        while(true){
            try {
                System.out.println(mensagem);
                faltas = teclado.nextInt();
                if (faltas >= 0 && faltas <= cargaHoraria) {
                    break;
                } else {
                    System.out.println("A quantidade informada é inválida!");
                    teclado = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um número inteiro.");
                teclado = new Scanner(System.in);
            }
        }

        return faltas;
    }
}
