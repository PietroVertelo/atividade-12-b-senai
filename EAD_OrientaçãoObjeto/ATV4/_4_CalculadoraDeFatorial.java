package OrientacaoAObjeto._4_CalculadoraDeFatorial;

import java.util.Scanner;

public class _4_CalculadoraDeFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadorafatorialfunc func = new calculadorafatorialfunc();
        System.out.println("Digite o numero que deseja: ");
        func.n1 = sc.nextInt();
        System.out.println(func.Calculadora());

    }
}
