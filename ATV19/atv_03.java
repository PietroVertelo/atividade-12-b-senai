package ATV_19;

public class atv_03 {
    public static void main(String[] args) {
        int[] numeros = {-3,-7,-4,-8,-21,19,16,15};
        int negativo=0,positivo=0;
        for (int numero : numeros) {
            if (numero < 0) {
                negativo++;
            } else if (numero > 0) {
                positivo++;
            }
        }
        System.out.print("Números: ");
        for (int num:numeros) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Positivos: "+positivo);
        System.out.println("Negativos: "+negativo);

    }
}
