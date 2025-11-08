package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int er = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int ori = sc.nextInt();

        if (er <= 0 || ori <= 0) {
            System.out.println("Por favor, insira apenas números inteiros positivos!");
        }
        else {
            int resto;
            while (ori != 0) {
                resto = er % ori;
                er = ori;
                ori = resto;
            }

            System.out.println(" O Máximo Divisor Comum é: " + er);
        }

        sc.close();
    }
}



