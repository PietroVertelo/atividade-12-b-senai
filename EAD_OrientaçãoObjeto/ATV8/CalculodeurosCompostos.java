package EAD.ATV8;

import java.util.Scanner;

public class CalculodeurosCompostos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        CalculodeJurosCompostosFUNC func= new CalculodeJurosCompostosFUNC();
        System.out.println("Qual o valor do capital a ser aplicado? ");
        func.capital = sc.nextDouble();
        System.out.println("Qual o valor da taxa? ");
        func.taxa = sc.nextDouble();
        System.out.println("São quantas prestações? ");
        func.tempo1=sc.nextDouble();
        System.out.println(func.CalculadoraJurosCompostos());
    }
}
