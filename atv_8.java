package ATV21;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class atv_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Digite os codigos(A12,B08,A18,C09");
        System.out.println("Digite FIM para encerrar o processo");
        String codigo;
        do{
            System.out.println("codigo: ");
            codigo = sc.nextLine().toUpperCase();
            if (!codigo.equals("FIM")){
                lista.add(codigo);

            }
        }while(!codigo.equals("FIM"));
        String alvo;
        do {
            System.out.println("Digite os codigos que está a procura (SAIR para encerrar o programa)");
            alvo = sc.nextLine().toUpperCase();
            int contador = 0;
            if (!alvo.equals("SAIR")) {
                contador = 0;
                for (String item : lista) {
                    if (item.equals(alvo)) {
                        contador++;

                    }

                }
            }
            if (contador > 0) {
                System.out.println("O codigo "+ alvo + " aparece " + contador + " vezes ");

            }else{
                System.out.println("o codigo " + alvo + " não foi digitado");
            }
            }
        while (!alvo.equals("SAIR"));
        System.out.println("Programa encerrado");
        sc.close();



        }
}