package ATV_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();
        int escolha;

        do {
            System.out.println("-------MENU-------");
            System.out.println("1-Adicionar");

            System.out.println("2-Listar");

            System.out.println("3-Listar preço maior que");

            System.out.println("4-Limpar");

            System.out.println("0-Sair");

            System.out.print("Digite o número da opção que deseja escolher: ");
            System.out.println();
            escolha = sc.nextInt();

            if (escolha==1) {
                System.out.println("Digite o preço a ser adicionado: ");
                double preco = sc.nextDouble();
                valores.add(preco);
                System.out.println("Preço adicionado.");

            } else if (escolha==2) {
                System.out.println("Preços: ");
                if (valores.isEmpty()) {
                    System.out.println("Nenhum preço foi cadastrado");
                }else {
                    for (double precos:valores) {
                        System.out.printf("R$%.2f%n",precos);
                    }
                }
                System.out.println();
            } else if (escolha==3) {
                System.out.println("Digite o preço:");
                double pMaior= sc.nextDouble();
                System.out.printf("Lista de preços maiores que: R$%.2f%n ",pMaior);
                boolean existe = false;
                for (double precos:valores) {
                    if (precos>pMaior) {
                        System.out.printf("R$%.2f%n",precos);
                        existe = true;
                    }
                }
                if (!existe) {
                    System.out.println("Nenhum preço maior que "+pMaior+" foi encontrado.");
                }
            } else if (escolha==4) {
                valores.clear();
                System.out.println("A lista de preços foi limpa");
            } else if (escolha==0) {
                System.out.println();
                System.out.println("Fechando o menu...");
            }

        }while (escolha!=0);
        sc.close();
    }
}
