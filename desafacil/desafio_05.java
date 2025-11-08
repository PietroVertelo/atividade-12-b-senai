package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class desafio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide que deseja gerar: ");

        int n = sc.nextInt();

        for (int a = 1; a <= n; a++) {
            for (int b = a; b < n; b++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print(a);
            }

            System.out.println();

        }

        sc.close();

    }
}