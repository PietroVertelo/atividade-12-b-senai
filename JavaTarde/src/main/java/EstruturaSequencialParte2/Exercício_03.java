package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_03 {
    public static void main(String[] args) {
        int P, preço,D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço do produto?");
        preço = sc.nextInt();
        D = preço / 15;
        System.out.printf("O desconto é: "+ D);
        sc.close();
    }
}
