package ATV_19;

public class atv_02 {
    public static void main(String[] args) {
        int[] numeros = {67,6,7,9,41,13,1,2,3,4};
        int soma=0;
        for (int contador=0;contador< numeros.length;contador++) {
            soma+=numeros[contador];
        }
        System.out.print("Números: ");
        for (int num:numeros) {
            System.out.print(num+" ");
        }
        System.out.println("Soma dos números: " + soma);
    }
}
