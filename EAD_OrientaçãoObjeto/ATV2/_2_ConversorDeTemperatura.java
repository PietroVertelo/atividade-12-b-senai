package OrientacaoAObjeto._2_ConversorDeTemperatura;

import java.util.Scanner;

public class _2_ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conversorfunc func = new conversorfunc();
        System.out.println("Digite o tipo de conversão que deseja realizar:\n" +
                "------------------------------------\n" +
                "Célcius para fahrenheit\n" +
                "Fahrenheit para célcius\n" +
                "------------------------------------");
        func.type = sc.nextLine();
        func.vect= func.type.split(" para ");
         func.p1 = func.vect[0];
        func.p3=func.vect[1];
        System.out.print("Insira a temperatura: ");
        func.temp = sc.nextDouble();
        System.out.println(func.max());
    }
}
