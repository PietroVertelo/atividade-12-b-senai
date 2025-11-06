package atv19;

import java.util.Scanner;

public class atv_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        int cont = 0;

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > 5) {
                cont++;
            }
        }

        System.out.println("Total de palavras com mais de 5 caracteres: " + cont);


    }
}
