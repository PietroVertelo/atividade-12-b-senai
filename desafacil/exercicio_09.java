package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int nu = sc.nextInt();

        if (nu <= 1) {
            System.out.println("Digite um número maior que 1.");
        }
        else {
            System.out.print("Fatores primos de " + nu + ": ");

            int div = 2;
            boolean pr = true;
            while (nu > 1) {
                int pot = 0;
                while (nu % div == 0) {
                    nu /= div;
                    pot++;
                }

                if (pot > 0) {
                    if (!pr) {
                        System.out.print(" * ");
                    }
                    System.out.print(div + "^" + pot);
                    pr = false;
                }
                div++;
            }
            System.out.println();
        }
        sc.close();
    }
}

