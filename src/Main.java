import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um dia da semana (número de 1 a 7):");
        int diaDaSemana = teclado.nextInt();

        //estrutura condicional comum
        System.out.println("Utilizando if e else if: ");
        if (diaDaSemana == 1){
            System.out.println("Domingo");
        } else if (diaDaSemana == 2){
            System.out.println("Segunda-feira");
        } else if (diaDaSemana == 3){
            System.out.println("Terça-feira");
        } else if (diaDaSemana == 4){
            System.out.println("Quarta-feira");
        } else if (diaDaSemana == 5){
            System.out.println("Quinta-feira");
        } else if (diaDaSemana == 6){
            System.out.println("Sexta-feira");
        } else if (diaDaSemana == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido!");
        }

        //switch-case
        System.out.println("Utilizando switch-case: ");
        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }

        teclado.close();
    }
}
