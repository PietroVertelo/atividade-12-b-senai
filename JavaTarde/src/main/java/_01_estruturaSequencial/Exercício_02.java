package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {
        double r, a;
        System.out.println("Digite o valor do raio do círculo : ");
        Scanner sc = new Scanner(System.in);
        r =  sc.nextDouble();
        a=3.14159*r*(r);
        System.out.printf("o resultado é:  %.4f%n",a);

    }
}
