package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_08 {
    public static void main(String[] args) {
        int n1,n2,resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("digite o valor do segundo numero:");
        n2 = sc.nextInt();
        resto= n1 % n2;
        System.out.printf("o valor do resto da divisao é:"+resto);

    }
}
