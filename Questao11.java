/*
 * VITÓRIA BARBOSA GOMES SOARES
 *
 * Desenvolva um programa que conte a quantidade de consoantes e de vogais presentes em um vetor. 
 * Os valores do vetor podem ser ingressados por teclado ou estáticos, ou seja, definidos no código:
 *  Por exemplo:
 *      vcharacters: {‘a’,’b’,’c’,’e’,’g’}
 * 
 *  consoantes: 3
 *  vogais: 2
 */

public class Questao11 {
    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'c', 'e', 'g'};
        System.out.print("\nCaracteres: ");

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("'" + caracteres[i] + "' ");
        }
        int consoantes = consoante(caracteres);
        System.out.println("\n\nConsoantes: " + consoantes);
        int vogais = caracteres.length - consoantes;
        System.out.println("Vogais: " + vogais);
    }
  
    static int consoante(char[] caracteres) {
        int countador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            char letra = caracteres[i];
            if (!vogal(letra)) countador++;
        } return countador;
    }
  
    static boolean vogal(char letra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') return true;
        else return false;
    }
}
