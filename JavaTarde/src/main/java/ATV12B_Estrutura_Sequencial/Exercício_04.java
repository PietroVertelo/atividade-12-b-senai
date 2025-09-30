package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_04 {
    public static void main(String[] args) {
        double x,y,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a medida da base do triângulo? ");
        x = sc.nextInt();
        System.out.println();
        System.out.println("Qual a medida da altura do triângulo? ");
        y = sc.nextInt();
        System.out.println();
        area = (x*y)/2;
        System.out.println("A área do triângulo é: "+ area);
        System.out.println("----------------------------");
        sc.close();



    }
}
