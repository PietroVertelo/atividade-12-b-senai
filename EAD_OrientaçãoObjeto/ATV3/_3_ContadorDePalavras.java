package OrientacaoAObjeto._3_ContadorDePalavras;

import java.util.Scanner;

public class _3_ContadorDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contadorfunc func = new contadorfunc();
        System.out.println("Digite um texto com várias frases:");
        func.texto = sc.nextLine();
        func.frases= func.texto.split(" ");
        System.out.println(func.max());
    }
}
