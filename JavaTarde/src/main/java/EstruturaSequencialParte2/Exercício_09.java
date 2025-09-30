package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_09 {
    public static void main(String[] args) {
        double A, B, b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base maior do trapézio");
        B = sc.nextDouble();
        System.out.println("Digite a base menor do trapézio");
        b = sc.nextDouble();
        System.out.println("Digite a aultura do trapézio");
        h = sc.nextDouble();
        A = (B + b) * h/2;
        System.out.println("O valor da área é: "+ A);
        sc.close();
    }
}
