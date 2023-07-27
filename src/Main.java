public class Main {
    public static void main(String[] args) {
        Palavras p1 = new Palavras();
        p1.testarFuncoesBasicas();
        p1.compararStrings("Abc", "Abd");
        p1.testarOutrosMetodos();
        String nomeCompleto = p1.lerString("Digite seu nome completo: ");
        System.out.println(nomeCompleto);
        String nomeAoContrario = p1.reverterPalavra(nomeCompleto);
        System.out.println(nomeAoContrario);
    }
}
