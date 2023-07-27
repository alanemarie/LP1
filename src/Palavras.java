import java.util.Scanner;

/**
 *
 * @author alanelima
 */
public class Palavras {
    
    Scanner teclado =  new Scanner(System.in);
    
    String nome = "Alane";  
    String nome2 = "Alane";
    String nome3 = new String("Alane");
    String sobrenome = "de Lima";
    String nada = "";
    String emBranco = "     ";
    String CPF = "**3**6";
    String numeros = "1,2,3,4,5";
    
    
    //concatenação
    String nomeCompleto = nome + " " + sobrenome;
    
    public void testarFuncoesBasicas(){
        System.out.println("Exemplo de concatenação dentro da função print:");
        int a = 10;
        System.out.println("*** O valor da variavel é "+a);
        
        System.out.println("Exemplo de concatenação com 'soma' de varáveis:");
        System.out.print("**** ");
        System.out.println(nomeCompleto);
        
        ///////////////
        System.out.println("Exemplo com contagem de caracteres:");
        int tamanho = nome.length();
        System.out.println("**** Seu nome possui "+tamanho+" caracteres.");
        tamanho = sobrenome.length();
        System.out.println("**** Seu sobrenome possui "+tamanho+" caracteres.");
        tamanho = nada.length();
        System.out.println("**** String com nada dentro: "+tamanho);
        tamanho = emBranco.length();
        System.out.println("**** String em branco: "+tamanho);
        
        ///////////////
        System.out.println("Exemplo com obtenção de caracter em posição específica: ");
        char pos3 = nome.charAt(2);
        System.out.println("**** O caracter na 3ª posição de seu nome é "+pos3);
        char pos4 = sobrenome.charAt(3);
        System.out.println("**** O caracter na 4ª posição de seu sobrenome é "+pos4);
    }
    
    public void compararStrings(String palavra1, String palavra2){
        System.out.println("Exemplo de comparação entre strings:");
        //if (nome == nome3) NÃO É UMA BOA PRÁTICA
        if(palavra1.equals(palavra2))
            System.out.println("**** Sim, "+palavra1+" é igual a "+palavra2);
       else
            System.out.println("**** Não, "+palavra1+" é diferente de "+palavra2);
        
        //////
        
        if (palavra1.compareTo(palavra2) == 0)
            System.out.println("**** As strings "+palavra1+" e "+palavra2+" são iguais.");
        else if (palavra1.compareTo(palavra2) < 0){
            System.out.print("**** ");
            System.out.println(palavra1+" vem antes de "+palavra2);
        } else {
            System.out.print("**** ");
            System.out.println(palavra1+" vem depois de "+palavra2);
         }
    }

    public void testarOutrosMetodos(){
        System.out.println("Deixar a string toda maiúscula");
        System.out.print("**** ");
        nome = nome.toUpperCase();
        System.out.println(nome);
        
        System.out.println("Deixar a string toda minúscula");
        System.out.print("**** ");
        nome = nome.toLowerCase();
        System.out.println(nome);
        
        System.out.println("Substituir **3 do CPF por 123: ");
        System.out.println("**** conteúdo antigo: "+CPF);
        CPF = CPF.replace("**3", "123");
        System.out.println("**** depois da substituição: " + CPF);
        
        String[] vetorDeNumeros = numeros.split(",");
        System.out.print("**** A 3ª string no vetor resultante é ");
        System.out.println(vetorDeNumeros[2]);
    }
    
    public String reverterPalavra(String palavra){
        StringBuilder sb = new StringBuilder(palavra);
        sb = sb.reverse();
        return sb.toString();
    }
    
    public String lerString(String mensagem){
        String s = "";
        
        while(true){
            System.out.println(mensagem);
            s = teclado.nextLine();
            s = s.trim(); //remove espaços em branco no início e no fim
            //if (!s.equals("")) //pergunta se a string não é vazia
            if (!s.isEmpty())
                break;
            else{
                System.out.println("Digite uma string que não seja vazia.");
                teclado = new Scanner(System.in);
            }
        }
        
        return s;
    }
}
