package EstruturaSequencialParte2;

import java.util.Scanner;

public class Exercício_07 {
    public static void main(String[] args) {
        double l,km,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de km percorridos:");
        km = sc.nextDouble();
        System.out.println("digite o valor de litros gastos:");
        l = sc.nextDouble();
        c= km/l;
        System.out.printf("o consumo medio de litros por km é de "+c);
        sc.close();
    }
}
