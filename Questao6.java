// VITÓRIA BARBOSA GOMES SOARES

/* 
  Desenvolva um programa que mostre um menu de opções. 
  Quando o usuário escolhe uma opção, o preço equivalente desta deve ser somado ào anterior e o menu deve ser mostrado novamente. 
  O menu só para de ser exibido quando o usuário escolhe a opção SAIR. Quando o usuário escolher essa opção, o programa deve mostrar o valor total da compra. 
    Exemplo:
    O usuário começa com a variável compras = 0 usd
    
    1. Arroz- 8 usd
    2. Feijao - 10 usd
    3. Batata - 15 usd
    4. Carne - 100 usd
    0. Sair
    "Ingresse com uma opção: "
    
    Suponha que o usuário digitou 2
    Total da Compra: 10usd
*/

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);           
        boolean continuar = true;
        int compra = 0;   
        while (continuar) {           
            String menu = """
                
                -------------------------
                          MENU
                -------------------------
                1. Arroz    -   8 usd
                -------------------------
                2. Feijao   -   10 usd
                -------------------------
                3. Batata   -   15 usd
                -------------------------
                4. Carne    -   100 usd
                -------------------------
                        0. Sair
                -------------------------
                """;
                
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    compra += 8;
                    break;
                case 2: 
                    compra += 10;
                    break;
                case 3:
                    compra += 15;
                    break;
                case 4:
                    compra += 100;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! :( ");
            }
        }
        System.out.println("\n\nTotal do pedido: " + compra + " usd.\n");
        scanner.close();
    }
}
