package ATV_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os e-mails separados por vírgula: ");
        String linha = sc.nextLine();

        if (linha == null || linha.trim().isEmpty()) {
            System.out.println("Nenhum e-mail informado!");
            sc.close();
            return;
        }

        String[] partes = linha.split(",");

        ArrayList<String> emails = new ArrayList<>();

        for (String p : partes) {
            String email = p.trim().toLowerCase();
            if (!email.isEmpty() && !emails.contains(email)) {
                emails.add(email);
            }
        }

        if (emails.isEmpty()) {
            System.out.println("Nenhum e-mail válido foi encontrado.");
        } else {
            System.out.println("E-mails registrados:");
            for (String e : emails) {
                System.out.println("- " + e);
            }
        }

    }
}