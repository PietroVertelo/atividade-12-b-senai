package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_10 {
    public static void main(String[] args) {
        double altura, peso, conta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua altura? ");
        altura = sc.nextDouble();
        System.out.println();
        peso = (72.7*altura)-58;
        System.out.printf("O peso ideal é: "+ peso);
        sc.close();

    }
}
