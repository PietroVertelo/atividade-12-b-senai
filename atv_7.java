package ATV21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();


        System.out.println("Digite palavras (digite 'fim' para encerrar):");
        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            palavras.add(entrada);
        }
        if (palavras.isEmpty()) {
            System.out.println("Nenhuma palavra foi inserida.");
            sc.close();
            return;
        }
        System.out.print("Digite o tamanho mínimo permitido: ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida! Digite um número inteiro.");
            sc.close();
            return;
        }
        int tamanhoM = sc.nextInt();
        if (tamanhoM < 0) {
            System.out.println("O tamanho mínimo não pode ser negativo.");
            sc.close();
            return;
        }
        palavras.removeIf(p -> p.length() < tamanhoM);

        System.out.println("\nPalavras que permaneceram na lista:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        sc.close();
    }
}


