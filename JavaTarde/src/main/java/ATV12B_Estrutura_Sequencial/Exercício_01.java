package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_01 {
    public static void main(String[] args) {
        int x,y,soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        x= sc.nextInt();
        System.out.println();
        System.out.println("Digite um segundo número: ");
        y = sc.nextInt();
        soma= x+y;
        System.out.println("A soma entre os números é: " + soma);
        System.out.println("-------------------------------");
        sc.close();


    }
}
