// VITÓRIA BARBOSA GOMES SOARES

// QUESTÃO 3 - Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. 
// Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
// Também testar se o saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
// (Resolva com if-else e operador ternário)

public class Questao3 { 
    public static void main(String[] args){
        double saldo = 140.00;
        double debito = 410.50;
        double credito = 500.00;
        double saldoAtual = saldo - debito + credito;
        
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Questão 3 - IF-ELSE\n");
        saldoClienteIfElse(saldo, debito, credito, saldoAtual);

        System.out.println("\n--------------------------------------------------\n");
        
        System.out.println("Questão 3 - OPERADOR TERNÁRIO\n");
        saldoClienteTernario(saldo, debito, credito, saldoAtual);
        System.out.println("\n--------------------------------------------------\n");
    }
    
    static void printExtrato(double saldo, double debito, double credito){     
        System.out.println("\n\tEXTRATO DA CONTA\n---------------------------------");
        System.out.printf("\nNúmero da conta: " + 123456);
        System.out.printf("\nSaldo: " + String.format("%.2f", saldo));
        System.out.printf("\nDébito: " + String.format("%.2f", debito));
        System.out.printf("\nCrédito: " + String.format("%.2f", credito));
    }

    static void saldoClienteIfElse(double saldo, double debito, double credito, double saldoAtual) {
        printExtrato(saldo, debito, credito);
        System.out.printf("\n\nSaldo Atual: " + String.format("%.2f", saldoAtual) + "\n");

        if (saldoAtual >= 0){
            System.out.println("\u001B[32m- Saldo Positivo! \u001B[0m");
        } else {
            System.out.println("\u001B[31m- Saldo Negativo! \u001B[0m");
        }
    }

    
    static void saldoClienteTernario(double saldo, double debito, double credito, double saldoAtual) {
        String statusConta = (saldoAtual >= 0) ? "\u001B[32m- Saldo Positivo! \u001B[0m" 
        : "\u001B[31m- Saldo Negativo! \u001B[0m";
      
        printExtrato(saldo, debito, credito);
        System.out.printf("\n\nSaldo Atual: " + String.format("%.2f", saldoAtual) + "\n" + statusConta);
    }
}
