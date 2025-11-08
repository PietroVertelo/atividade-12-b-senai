package atv21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> eu = new ArrayList<Double>();
        int contador = 0;
        int m = 0;
        int soma = 0;
        System.out.println("Digite os valores de compra. O numero 0 finaliza o programa!!");
        while (true) {
            System.out.println("digite os valors:");
            double valor = sc.nextInt();
            if (valor == 0) {
                System.out.println("sistema finalizado");
                break;
            }
            eu.add(valor);
            soma += valor;
            contador++;
        }

        {
            if (contador > 0) {
                m = soma / contador;
            }
            {for (double i : eu) {
            } System.out.println("a media desse valores é igual a:" + m);
                System.out.println("a soma de todos os valor é:" + soma);
        }
    }
}}
