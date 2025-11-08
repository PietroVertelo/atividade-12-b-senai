package ATV_21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Digite os nomes(digite fim para encerrar a inserção de dados):");
        while (true) {
            String nome = sc.next().trim().toLowerCase();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            } else if (!nome.isEmpty()) {
                list.add(nome);
            }
        }

        if (list.isEmpty()) {
            System.out.println("Nenhum nome foi informado.");
            sc.close();
            return;
        }

        System.out.print("Digite o valor das rotações:  ");
        int k = sc.nextInt();


        for (int i = 0; i < k; i++) {
            String primeiro = list.remove(0); // remove o primeiro
            list.add(primeiro);               // adiciona no final
        }

        System.out.println("A ordem dos nomes depois de  " + k + " rotações é :");
        for (String nome : list) {
            System.out.println(nome);
        }

    }
}
