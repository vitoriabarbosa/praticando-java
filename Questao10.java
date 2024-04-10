/* 
VITÓRIA BARBOSA GOMES SOARES

Desenvolva um programa para multiplicar dois vetores do mesmo tamanho. Os resultados devem ser armazenados em um vetor resultante.
    Por exemplo:

    v1: {1,3,4,5}
    v2: {1,4,5,6}
    v-resultado:{1,12,20,30}
*/

public class Questao10 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 5, 7};
        int[] vetor2 = {2, 4, 6, 8};
        int[] resultado = new int[vetor1.length];

        System.out.print("\nPrimeiro vetor: ");
        imprimir(vetor1);
        System.out.print("\nSegundo vetor: ");
        imprimir(vetor2);

        multiplicarVetores(vetor1, vetor2, resultado);
        System.out.print("\nMultiplicação dos vetores: ");
        imprimir(resultado);
    }
    static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        } System.out.println();
    }
    static void multiplicarVetores(int[] vetor1, int[] vetor2, int[] resultado) {
        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = vetor1[i] * vetor2[i];
        }
    }
}
