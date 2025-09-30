package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_06 {
    public static void main(String[] args) {
        int temperatura, graus;
        double C, F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus está fazendo?");
        C = sc.nextInt();
        F = (C * 9/5) + 32;
        System.out.println("Convertido C para F é: "+ F);
    }
}
