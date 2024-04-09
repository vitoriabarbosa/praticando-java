/* 
  ALUNA: VITÓRIA BARBOSA GOMES SOARES
  
  A sequência Collatz mais larga
  
  - A seguinte sequência iterativa esta definida pelo conjunto de inteiros positivos:
      n-> n/2 (n é par)
      n->3n + 1(n é ímpar)
  
  - Usando a regra acima e começando com 13, geramos a seguinte sequência:
      13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1​
      Pode-se ver que esta sequência (começando em 13 e terminando em 1) contém 10 termos, e 9 passos.
  
  Implemente um programa que mostre o número com a cadeia mais larga, o número de passos, e a sequência debaixo de um determinado limite. Exemplo: Limite: 10,  Número:9 , Passos: 19, sequencia: ....  
*/

public class Questao8 {
    public static void main(String[] args) {
        int limite = 10;
        int maiorCadeia = 0;
        int numeroMaiorCadeia = 0;
        int passos = 0;
        String sequencia = "";

        for (int i = 1; i < limite; i++) {
            int n = i;
            int contador = 0;
            StringBuilder seqBuilder = new StringBuilder();

            while (n != 1) {
                seqBuilder.append(n).append(" -> ");
                if (n % 2 == 0)
                    n = n / 2;
                else
                    n = 3 * n + 1;
                contador++;
            }
            seqBuilder.append(1);
            
            if (contador > maiorCadeia) {
                maiorCadeia = contador;
                numeroMaiorCadeia = i;
                passos = contador;
                sequencia = seqBuilder.toString();
            }
        }
        System.out.println("\nLimite: " + limite);
        System.out.println("\nNúmero com a cadeia mais longa: " + numeroMaiorCadeia);
        System.out.println("\nNúmero de passos: " + passos);
        System.out.println("\nSequência: " + sequencia + "\n");
    }
}
