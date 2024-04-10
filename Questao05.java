/*
 * VITÓRIA BARBOSA GOMES SOARES
 * 
 * Desenvolva um programa que leia um intervalo, busque quantos números são múltiplos de 3 naquele intervalo, e mostre a soma destes números.
 * Exemplo:
 *    Intervalo: 1 à 10
 *    Total de Múltiplos de 3: 3
 *    Soma: 18
 */

import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("\nDigite o valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor limite: ");
        int limite = scanner.nextInt();
        System.out.println();
        System.out.print("Intervalo: ");

        int totalMultiplos = 0;
        int somaMultiplos = 0;
        for (int i = inicio; i <= limite; i++) {
            if (i % 3 == 0) {
                totalMultiplos++;
                somaMultiplos += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nTotal de Múltiplos de [3]: " + totalMultiplos);
        System.out.println("\nSoma dos Múltiplos: " + somaMultiplos + "\n");
        scanner.close();
    }
}
