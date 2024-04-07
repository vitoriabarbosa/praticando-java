// VITÓRIA BARBOSA GOMES SOARES

/* 
QUESTÃO 4 - Implemente um programa, que permita ao usuário ingressar os dados de dureza, teor de carvão 
e a resistência da tração e como saída mostre a pontuação do aço. (Resolva com if-else)

    - O grau do aço é obtido em base às seguintes condições:
    Dureza deve ser maior que 50
    Teor de Carvão deve ser menor que 0.7
    Resistencia à tração deve ser maior que 5600

    - As pontuações são obtidas da seguinte forma:
    Pontuação é 10 se todas as condições são cumpridas
    Pontuação é 9 se as condições (i) e (ii) são cumpridas
    Pontuação é 8 se as condições (ii) e (iii) cumpridas
    Pontuação é 7 se as condições (i) e (iii) cumpridas
    Pontuação é 6 se somente uma condição é cumprida
    Pontuação é 5 se nenhuma das condições são cumpridas
*/


import java.util.Scanner;

public class Questao4 {    
    public static void main(String[] args){
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Questão 4 - IF-ELSE\n\n");
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dados de dureza: ");
        int dureza = scanner.nextInt();
        
        System.out.print("-\nTeor de carvão: ");
        float teor = scanner.nextFloat();
        
        System.out.print("-\nResistência à tração: ");
        int resistencia = scanner.nextInt();
        int pontuacao;
        
        if (dureza > 50 && teor < 0.7 && resistencia > 5600) {
            pontuacao = 10;
        } else if (dureza > 50 && teor < 0.7) {
            pontuacao = 9;
        } else if (teor < 0.7 && resistencia > 5600) {
            pontuacao = 8;
        } else if (dureza > 50 && resistencia > 5600) {
            pontuacao = 7;
        } else if (dureza > 50 || teor < 0.7 || resistencia > 5600) {
            pontuacao = 6;
        }  else {
            pontuacao = 5;
        }        
        System.out.println("\n\n- A pontuação do aço é " + pontuacao);
        System.out.println("\n--------------------------------------------------\n");
        scanner.close();
    }
}
