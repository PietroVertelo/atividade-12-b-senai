package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_05 {
    public static void main(String[] args) {
        double salario, aumento,operação;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o salário do funcionario? ");
        salario = sc.nextDouble();
        System.out.println();
        operação = (salario)*0.1;
        aumento = operação + salario;
        System.out.printf("O aumento do salário fica em: "+ aumento);
    }
}
