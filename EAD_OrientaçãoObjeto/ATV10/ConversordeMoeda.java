package EAD.ATV10;

import java.util.Scanner;

public class ConversordeMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversordeMoedaFUNC func = new ConversordeMoedaFUNC();

        System.out.println("Digite respectivamente a moeda a ser convertida, o valor a ser convertido e a moeda para qual será convertido o valor (Real, Dólar ou Euro):");
        func.dados = sc.nextLine();

        double resultado = func.impressao();

        System.out.println("Valor convertido: " + resultado);
    }
}
