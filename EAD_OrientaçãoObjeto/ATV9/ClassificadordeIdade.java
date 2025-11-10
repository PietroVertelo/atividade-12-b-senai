package EAD.ATV9;

import java.util.Scanner;

public class ClassificadordeIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ClassificadordeIdadeFUNC func=new ClassificadordeIdadeFUNC();
        System.out.println("Insira a idade que quer verificar: ");
        func.idade = sc.nextInt();
        System.out.println(func.ClassificadorIdade());
    }
}
