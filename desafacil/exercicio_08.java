package desafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int deci = sc.nextInt();

        String bin = "";
        int n = deci;

        if (n == 0) {
            bin = "0";
        }
        else {
            while (n > 0) {
                int rest = n % 2;
                bin = rest + bin;
                n = n / 2;
            }
        }

        System.out.println("Representação binária de " + deci + " é: " + bin);
    }
}

