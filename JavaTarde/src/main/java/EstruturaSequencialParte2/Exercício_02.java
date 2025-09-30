package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {
        double horas, minutos;
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira a quantidade de horas desejada para a conversão: ");
        horas = sc.nextDouble();
        System.out.println();
        minutos = horas*60;
        System.out.println("Convertendo, "+horas+" horas, são "+minutos+" minutos");
        sc.close();

    }
}
