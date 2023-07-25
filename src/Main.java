public class Main {
    public static void main(String[] args) {
        //Subindo a escada

        //estrutura WHILE
        int inicio = 0;
        int fim = 5;
        int i = inicio;

        //int i = 0;
        while (i < fim) {
            //instrução principal que será repetida
            System.out.println("Subindo degrau "+i+" da escada.");

            //passo de atualização
            i++;
        } 

        //Descendo a escada

        inicio = 4;
        fim = 0;
        i = inicio;

        while (i >= fim) {
            System.out.println("Descendo degrau "+i+" da escada");
            i--;
        }

        //--------------------------------------------------------
        System.out.println("----Começando do 1 / indo até o 1");

        //Subindo a escada

        inicio = 1;
        fim = 5;
        i = inicio;
        
        while (i <= fim) {
            System.out.println("Subindo degrau "+i+" da escada.");
            i++;
        }

        //Descendo a escada

        inicio = 5;
        fim = 1;
        i = inicio;

        while (i >= fim) {
            System.out.println("Descendo degrau "+i+" da escada");
            i--;
        }
    }
}
