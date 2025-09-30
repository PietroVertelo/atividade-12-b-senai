package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_08 {
    public static void main(String[] args) {
        double compra,parcela;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor da compra? ");
        compra =  sc.nextDouble();
        System.out.println();
        parcela= (compra/3);
        System.out.printf("O valor a ser pago em três parcelas iguais é: "+ parcela);
        sc.close();
    }
}
