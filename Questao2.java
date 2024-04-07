// VITÓRIA BARBOSA GOMES SOARES

// QUESTÃO 2 - Ingresse um número e mostre o dia da semana. (Resolva com switch-case)

public class Lab2Questao2 {   
    public static void main(String[] args) {
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Questão 2 - SWITCH CASE\n\n\nDias da Semana!\n");
        int dia = 7;   
        switch (dia) {
            case 1: System.out.println("Dia "+ dia +" - Segunda!");
                break;
            case 2: System.out.println("Dia "+ dia +" - Terça!");
                break;
            case 3: System.out.println("Dia "+ dia +" - Quarta!");
                break;  
            case 4: System.out.println("Dia "+ dia +" - Quinta!");
                break;
            case 5: System.out.println("Dia "+ dia +" - Sexta!");
                break;
            case 6: System.out.println("Dia "+ dia +" - Sabado!");
                break;
            default: System.out.println("Dia "+ dia +" - Domingo!");
                break;    
        }
        System.out.println("\n--------------------------------------------------\n");
    }
}
