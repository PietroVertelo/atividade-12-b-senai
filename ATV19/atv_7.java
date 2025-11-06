package atv19;

import java.util.Scanner;

public class atv_7 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i=0; i<vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextInt();


        } for (int i = 0; i < vetor.length; i++) {
            int z= i+1;
            System.out.println("Posição " + z + ": " + vetor[i]);
    }
}}
