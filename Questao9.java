/*
ALUNA: VITÓRIA BARBOSA GOMES SOARES

Implemente um programa que ordene os valores de um vetor de inteiros em ordem crescente. 
Os valores iniciais do vetor podem ser preenchidos por teclado ou usando o método Math.random.
*/

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        System.out.print("\nVetor antes da ordenação: ");
        imprimir(vetor);

        ordenar(vetor);
        System.out.print("\nVetor ordenado: ");
        imprimir(vetor);
        scanner.close();
    }
    static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        } 
        System.out.println();
    }
    static void ordenar(int[] vetor) {
        int num = vetor.length;

        for (int i = 0; i < num - 1; i++) {
            int atual = i;
            for (int j = i + 1; j < num; j++) {
                if (vetor[j] < vetor[atual]) atual = j;
            }
            if (atual != i) {
                int armazenar = vetor[i];
                vetor[i] = vetor[atual];
                vetor[atual] = armazenar;
            }
        }
    }
}
