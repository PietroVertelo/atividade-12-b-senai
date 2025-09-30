package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_07 {
    public static void main(String[] args) {
        double dias, horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("São quantos dias? ");
        dias = sc.nextDouble();
        System.out.println();
        horas = dias * 24;
        System.out.println("Convertendo os dias para horas, "+ dias+" dias são: "+horas+ " horas");
        System.out.println();
        sc.close();









    }
}
