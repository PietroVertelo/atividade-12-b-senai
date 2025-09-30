package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_06 {
    public static void main(String[] args) {
        int V, T, D, R;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o valor do depósito");
        D = sc.nextInt();
        System.out.println("Qual a taxa de juros ao mês?");
        T = sc.nextInt();
        R = D / T;
        System.out.printf("O rendimento ao mês foi: "+ R);
        sc.close();



    }
}
