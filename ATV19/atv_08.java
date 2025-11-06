package atv19;

import java.util.Scanner;

public class atv_08 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int[] vec= new int[6];
        for (int i=0; i<vec.length; i++){
            System.out.println("digite o numero:");
            vec[i]= sc.nextInt();
        }for (int i=0; i<vec.length;i++){
            if (vec[i]%2==0){
                System.out.println("o numero "+vec[i]+" é par");
            }else System.out.println("o numero "+vec[i]+" é impar");
        }
    }
}
