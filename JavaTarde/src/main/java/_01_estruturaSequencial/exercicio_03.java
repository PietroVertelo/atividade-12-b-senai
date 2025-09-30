package _01_estruturaSequencial;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        int a, b, c ,d, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor C: ");
        c = sc.nextInt();
        System.out.println("Digite o valor D: ");
        d = sc.nextInt();
        r = (a*b-c*d);
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + r);





    }
}
