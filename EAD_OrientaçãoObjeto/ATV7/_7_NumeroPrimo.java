package OrientaçãoObjeto._7_NumeroPrimo;

import java.util.Scanner;

public class _7_NumeroPrimo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        numeroPrimo_função prim = new numeroPrimo_função();
        System.out.println("Digite um numero");
        prim.h = sc.nextInt();
        System.out.println("=== Verificador de Número Primo ===");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numeroPrimo_função.prim(numero))
            System.out.println(numero + " é primo.");
        else
            System.out.println(numero + " não é primo.");

    }
}
