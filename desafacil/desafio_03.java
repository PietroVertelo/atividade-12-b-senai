package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class desafio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro de até 7 dígitos: ");

        int n = sc.nextInt();
        int original = n;
        int inverted = 0;

        while (n >0) {
            int rest = n % 10;
            inverted = inverted * 10 + rest;
            n = n /10;
        }

        if (original == inverted) {
            System.out.println("O número é um palíndromo.");
        }

        else {
            System.out.println("O número NÃO é um palíndromo.");
        }

        System.out.println("Digite uma palavra: ");
        String word = sc.next();

        boolean isPalindromo = true;

        int size = word.length();

        for (int i = 0; i < size / 2; i++) {
            if (word.charAt(i) != word.charAt(size - 1 - i)) {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        }

        else {
            System.out.println("A palavra NÃO é um palíndromo.");
        }

        sc.close();

    }
}
