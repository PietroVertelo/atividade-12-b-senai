package OrientacaoAObjeto._6_CalculadoraDeMedia;

import java.util.Scanner;

public class _6_CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadormediafunc func = new calculadormediafunc();
        System.out.println("=== Calculadora de Média de Notas ===");
        System.out.println("Informe o número de notas");
        func.qtd = sc.nextInt();
        System.out.println(func.calcular());
    }
}
