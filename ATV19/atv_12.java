package ATV_19_Vetores;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vect[] = new int[5];
        int soma = 0;

        for (int n = 0; n < 5; n++) {
            System.out.print("Insira um número: ");
            vect[n] = sc.nextInt();
            soma = vect[n];
        }
        System.out.print("Vetores: ");
        for (int num = 0; num < 5; num++) {
            if (vect[num] == vect[2])
                vect[num] = 0;
            System.out.print(vect[num]);
            System.out.print(",");
        }
    }
}



