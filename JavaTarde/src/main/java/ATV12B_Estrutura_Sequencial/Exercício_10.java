package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_10 {
    public static void main(String[] args) {
        double x,y,z, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:   ");
        x = sc.nextDouble();
        System.out.println();
        System.out.println("Digite o segundo número:    ");
        y = sc.nextDouble();
        System.out.println();
        System.out.println("Digirte o terceiro número:  ");
        z = sc.nextDouble();
        System.out.println();
        resultado = (x+y+z)/3;
        System.out.println();
        System.out.println("A média aritmética entre os valores inseridos é: "+ resultado);




    }
}
