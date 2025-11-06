package ATV_19_Vetores;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os e-mails separados por vírgula: ");
        String contas = sc.nextLine();


        String[] emails = contas.split(",");


        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }


        System.out.println("Todos os e-mails: ");
        for (String email : emails) {
            System.out.println(email);
        }


        String[] emailsUnicos = new String[emails.length];
        int contadorUnicos = 0;


        for (String email : emails) {
            boolean repetido = false;
            for (int i = 0; i < contadorUnicos; i++) {
                if (email.equals(emailsUnicos[i])) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                emailsUnicos[contadorUnicos] = email;
                contadorUnicos++;
            }
        }

       
        System.out.println("e-mails únicos: ");
        for (int i = 0; i < contadorUnicos; i++) {
            System.out.println(emailsUnicos[i]);
        }
    }
}
