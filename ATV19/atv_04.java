package ATV_19;

public class atv_04 {
    public static void main(String[] args) {
        int[] numeros={6,12,18,24,30,36};
        int menor=numeros[0];
        int maior = numeros[0];
        for (int comparacao=1;comparacao<numeros.length;comparacao++) {
            if (numeros[comparacao]>maior) {
                maior=numeros[comparacao];
            } else if (numeros[comparacao]<menor) {
                menor=numeros[comparacao];
            }
        }
        System.out.println("Números: ");
        for (int num:numeros) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Número maior: "+maior);
        System.out.println("Número menor: "+menor);
    }
}
