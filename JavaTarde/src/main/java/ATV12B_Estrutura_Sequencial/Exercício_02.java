package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("digite um numero:");
        System.out.println();
        x = sc.nextDouble();
        y= x+x;
        System.out.printf("o valor do dobro é:"+y);
    }
}
