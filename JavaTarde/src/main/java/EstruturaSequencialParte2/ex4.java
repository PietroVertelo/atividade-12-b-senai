package EstruturaSequencialParte2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double n1,n2,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        n1= sc.nextDouble();
        System.out.println("digite o segundo numero:");
        n2= sc.nextDouble();
        a= (n1*2)+(n2*3);
        b= a/5;
        System.out.printf("o resultado da media ponderada é:"+b);
        sc.close();

    }
}
