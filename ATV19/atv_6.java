package atv19;

import java.util.Scanner;

public class atv_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.print("Digite um número para buscar: ");
        int num = sc.nextInt();

        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado.");
        }

    }
}