package ATV_21;

import java.util.ArrayList;
import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temp = new ArrayList<>();

        System.out.println("Digite 7 temperaturas:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Temperatura " + i + ": ");
            double celcius = sc.nextDouble();
            temp.add(celcius);
        }

        System.out.println("Leituras registradas:");

        for (Double t : temp) {
            if (t >= 35) {
                System.out.println(t + " C  -> Alerta de calor!");
            } else {
                System.out.println(t + " C");
            }
        }
    }
}
