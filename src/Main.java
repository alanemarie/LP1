public class Main {
    public static void main(String[] args) {

        //Subindo a escada

        int inicio = 0; //base da escada
        int fim = 5; //topo da escada
        int i; //eu andando na escada

        //estrutura FOR 
        for (i = inicio; i < fim; i++) {
            System.out.println("Subindo degrau "+i+" da escada."); //ação repetida -> subir um degrau na escada
        }

        System.out.println("---------------------------");

        //Descendo a escada

        inicio = 4;
        fim = 0;

        for (i = inicio; i >= fim; i--) {
            System.out.println("Descendo degrau "+i+" da escada."); //ação repetida -> descer um degrau na escada
        }



        System.out.println("-------- Começando com 1 / Indo até o 1: ----------");


        //Subindo a escada

        /*inicio = 0;
        fim = 5;

        for (i = inicio; i < fim; i++) {
            System.out.println("Subindo degrau "+(i+1)+" da escada."); //ação repetida -> subir um degrau na escada
        }*/

        inicio = 1;
        fim = 5;

        for (i = inicio; i <= fim; i++) {
            System.out.println("Subindo degrau "+i+" da escada."); //ação repetida -> subir um degrau na escada
        }

        //Descendo a escada

        /*inicio = 4;
        fim = 0;

        for (i = inicio; i >= fim; i--) {
            System.out.println("Descendo degrau "+(i+1)+" da escada."); //ação repetida -> descer um degrau na escada
        }*/

        System.out.println("---------------------------");

        inicio = 5;
        fim = 0;

        for (i = inicio; i > fim; i--) {
            System.out.println("Descendo degrau "+i+" da escada."); //ação repetida -> descer um degrau na escada
        }
    }
}
