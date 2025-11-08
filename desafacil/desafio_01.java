package desafiosJava;

import java.util.Scanner;

public class desafio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números da sequência de Fibonacci deseja gerar?");
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            long c;
            if (i == 0) {
                c = a;
            }
                else if (i == 1) {
                    c = b;
                } else {
                    c = a + b;
                    a = b;
                    b = c;
                }
                boolean primo = true;
                if (c < 2) {
                    primo = false;
                } else {
                    for (int j = 2; j < c; j++) {
                        if (c % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) {
                    System.out.println(c + " *");
                } else {
                    System.out.println(c);
                }
            }
            sc.close();
            }
        }
