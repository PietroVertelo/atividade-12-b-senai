package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 399: ");

        int n = sc.nextInt();

        if (n < 1 || n > 399) {
            System.out.println("Número inválido. ");
            return;
        }

        String roman = "";

        while (n >= 100) {
            roman += "C";
            n -= 100;
        }

        if (n >=90) {
            roman +="XC;";
            n -= 90;
        }

        while (n >= 50) {
            roman +="L";
            n -=50;
        }

        if (n >=40) {
            roman += "XL";
            n -= 40;
        }

        while (n >=10) {
            roman += "X";
            n -= 10;
        }

        if (n >=9) {
            roman += "IX";
            n -= 9;
        }

        while (n >=5) {
            roman += "V";
            n -= 5;
        }

        if (n >=4) {
            roman += "IV";
            n -= 4;
        }

        while (n >=1) {
            roman += "I";
            n -= 1;
        }

        System.out.println("Número em romano: "+ roman);

        sc.close();

    }
}