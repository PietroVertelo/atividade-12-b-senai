package desafiosJava;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nS = rand.nextInt(100) + 1;
        int tent = 0;
        int lI = 1;
        int lS = 100;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        int tri = 0;

        while (tri != nS) {
            System.out.print("Digite seu palpite: ");
            tri = sc.nextInt();
            tent++;

            if (tri < nS) {
                System.out.println("É maior!");

                if (tri >= lI) lI = tri + 1;
            }
            else if (tri > nS) {
                System.out.println("É menor!");

                if (tri <= lS) lS = tri - 1;
            }
        }
        System.out.println("\n🎉 Parabéns! Você acertou o número: " + nS);
        System.out.println("Número de tentativas: " + tent);

        int maxTentativasBinaria = (int) Math.ceil(Math.log(100) / Math.log(2));

        if (tent <= maxTentativasBinaria) {
            System.out.println("Você se aproximou da lógica de Busca Binária! 🟢");
        }
        else {
            System.out.println("Sua tentativa foi ineficiente. Tente usar a lógica de meio do intervalo. ");
        }
        sc.close();
    }
}

