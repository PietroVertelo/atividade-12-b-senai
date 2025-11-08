package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class desafio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja sacar: ");

        int value = sc.nextInt();
        int notes50 = 0, notes10 = 0, notes2 = 0;

        if (value < 2) {
            System.out.println("Valor inválido! O saque mínimo é de R$2.");

        } else {
            while (value >= 50) {
                value -= 50;
                notes50++;
            }

            while (value >= 10) {
                value -= 10;
                notes10++;
            }

            while (value >= 2) {
                value -= 2;
                notes2++;
            }

            System.out.println("\nDistribuição de cédulas:");
            System.out.println("Notas de 50: " + notes50);
            System.out.println("Notas de 10: " + notes10);
            System.out.println("Notas de 2 : " + notes2);

            if (value != 0) {
                System.out.println("Valor restante (" + value + " real) não pode ser sacado com as cédulas disponíveis.");
            }
        }

        sc.close();

    }
}
