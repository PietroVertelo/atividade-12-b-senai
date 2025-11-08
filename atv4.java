package atv21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String arm;
        ArrayList<String> array = new ArrayList<>();

        System.out.println("Digite a frase:");
        arm = sc.nextLine(); // lê a frase

        String[] split = arm.split("\\s+");

        for (String ler : split) {
            array.add(ler);

        }
        System.out.println("Palavras com até 4 letras:");
        for (String p : array) {
            if (p.length() <= 4) {
                System.out.println(p);

            }else System.out.println("nao foi encontrado nenhuma palavra com ate 4 letras!!");
        }
    }}