package atv21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        String arm;

        System.out.println("Digite os nomes. Para finalizar, digite: FIM");

        while (true) {
            System.out.print("Digite um nome: ");
            arm = sc.nextLine();

            if (arm.equalsIgnoreCase("FIM")) {
                break;
            }

            array.add(arm);
        }

        System.out.println("\nNomes digitados:");
        for (String nome : array) {
            System.out.println(nome);
        }
    }
}
