public class Exemplo1 {
    
    public void exibirExemplo(){
         //inicialização
         int i = 1;

         while (true){    //while (i <= 10)
             //bloco de instruções a serem repetidas
             System.out.println("[WHILE] Entrou no laço para a variável "+i);
 
             //condição de parada --> nesse exemplo ficou aqui por conta de ser loop infinito
             if (i == 10)
                 break;
 
             //atualização da variável de controle
             i++;
         }
 
         //////////////////////////////////////
 
         i = 1;
         do {
             System.out.println("[DO-WHILE] Entrou no laço para a variável "+i);
 
             if (i == 10)
                 break;
 
             i++;
         } while (true);
     }
}
