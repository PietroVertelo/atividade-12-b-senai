package ATV_19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 5;
        double[] vect = new double[n];
        for(int i=0; i<n;i++) {
            vect[i]=sc.nextDouble();
        }
        double resultados = 0.0;
        for (int i=0;i<n;i++) {
            resultados+= vect[i];
        }
        double notas = resultados / n;
        System.out.printf("Média das notas: %.2f%n", notas);
        sc.close();
    }
}
