package OrientacaoAObjeto._6_CalculadoraDeMedia;

import java.util.Scanner;

public class calculadormediafunc {
   Scanner sc = new Scanner(System.in);
    public int qtd;
    public String calcular(){
        String resp=" ";
        double soma=0;
        double n=0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            n = sc.nextDouble();


            if (n < 0 || n > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                i--; // repete a iteração
            }
        }
        soma+=n;
        double media=(soma/qtd);
        if(media>=7) {
            resp = (media+": Aprovado");
        } else if (media<7) {
            resp = (media+": Recuperação");
        }
return resp;

    }
}
