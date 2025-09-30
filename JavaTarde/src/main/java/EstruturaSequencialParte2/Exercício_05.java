package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_05 {
    public static void main(String[] args) {
        double a, p,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do lado do quadrado? ");
        l = sc.nextDouble();
        System.out.println();
        a = (l*l);
        p = (l*4);
        System.out.printf("A área do quadrado mede "+a+" metros quadrados, enquanto seu perímetro mede "+ p+" metros.");
        sc.close();



    }
}
