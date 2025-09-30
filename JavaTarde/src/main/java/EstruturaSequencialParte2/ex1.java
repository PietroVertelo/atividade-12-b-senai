package EstruturaSequencialParte2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a sua idade:");
        a = sc.nextDouble();
        b = a*365;
        System.out.printf("o valor de dias que voce tem, desde o seu nascimento é de:"+b);
        sc.close();
    }
}
