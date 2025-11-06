package ATV19;

import java.util.Scanner;

public class atv_11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;
        System.out.println("Digite 5 idades");

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = input.nextInt();
            soma += idades[i];

        }
        double media = (double) soma / idades.length;
        System.out.println("Idades digitadas");
        for (int i = 0; i < idades.length;i++){
            System.out.println(idades[i] + " ");
        }
        System.out.printf("Média das Idades %.2/n", media);
    }
}
