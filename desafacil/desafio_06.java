package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class desafio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("======= TABUADA DE 1 A 10 =======\n");

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                int resultado = a * b;
                System.out.printf("%4d", resultado);

            }
            System.out.println();
        }
        sc.close();
    }
}

