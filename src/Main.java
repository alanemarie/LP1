public class Main {
    public static void main(String[] args) {
        Exemplo1 ex1 = new Exemplo1();
        Exemplo2 ex2 = new Exemplo2();
        Adivinhacao jogo = new Adivinhacao();
        CaixaEletronico cx = new CaixaEletronico();

        //ex1.exibirExemplo();
        //ex2.exibirExemplo();
        //jogo.jogoDaAdivinhacao();
        cx.setSaldo(0.0);
        cx.menu();
    }
}
