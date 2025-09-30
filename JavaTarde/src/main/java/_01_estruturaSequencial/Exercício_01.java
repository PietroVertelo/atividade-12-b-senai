package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercício_01 {
    public static void main(String[] args) {
        int x, y;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        x= sc.nextInt();
        System.out.println("Digite outro: ");
        y= sc.nextInt();
        z= x + y;
        System.out.printf("O Resultado da soma é: " + z );
    }
}
