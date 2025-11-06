package ATV19;



import java.util.Random;
import java.util.Scanner;

public class atv_10 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();


        }
        System.out.println("Vetor normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Vetor invertido:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
