package atv21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pietro = new ArrayList<String>();// arrayList

        System.out.println("Digite as tarefas separadas por vírgula:");
        String arm = sc.nextLine();//arm armazena as tarefas

        String[] eu = arm.split(",");//split para separar as palvras por virgulas
        for (int i = 0; i < eu.length; i++) { //lenght pega as palvras separadas por virgula e tranforma em unidade
            pietro.add(eu[i]);//
        }

        int numero = 1;
        for (String z : pietro) {
            System.out.println("Tarefa número " + numero + ": " + z);
            numero++;
        }
    }
}
