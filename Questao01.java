/*
 * VITÓRIA BARBOSA GOMES SOARES
 * 
 * As maçãs custam R$ 1,30 cada, se forem compradas menos de uma dúzia e R$ 1,00, se forem compradas pelo menos 12. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 
 * (Resolva com if-else e operador ternário)
 */
    
public class Questao01 {
    public static void main(String[] args) {
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Questão 1 - IF-ELSE\n");
        comprarMacasIfElse(8);
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Questão 1 - OPERADOR TERNÁRIO\n");
        comprarMacasTernario(20);
        System.out.println("\n--------------------------------------------------\n");
    }

    static void comprarMacasIfElse(int quantidadeMaca){
        double preco;
        if (quantidadeMaca >= 12){
            preco = quantidadeMaca * 1.00;
        } else {
            preco = quantidadeMaca * 1.30;
        }
        System.out.println("Quantidade de maçãs: " + quantidadeMaca);
        System.out.printf("Total: R$ " + String.format("%.2f", preco) + "\n");
    }

    static void comprarMacasTernario(int quantidadeMaca){
        double preco = (quantidadeMaca >= 12) ? quantidadeMaca * 1.00 : quantidadeMaca * 1.30;
        System.out.println("Quantidade de maçãs: " + quantidadeMaca);
        System.out.printf("Total: R$ " + String.format("%.2f", preco) + "\n");
    }
}
