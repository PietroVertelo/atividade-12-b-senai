package ATV12B_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercício_03 {
    public static void main(String[] args) {
        int raio;
        double pi, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        raio= sc.nextInt();
        pi= 3.14;
        area = pi*(raio*raio);
        System.out.println("A área do círculo é: " + area);




    }
}
