package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_09 {
    public static void main(String[] args) {
        int i, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade em anos?");
        i= sc.nextInt();
        m = i*12;
        System.out.println("A idade convertida em meses é: "+m);

    }
}
