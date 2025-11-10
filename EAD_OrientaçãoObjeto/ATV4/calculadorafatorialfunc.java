package OrientacaoAObjeto._4_CalculadoraDeFatorial;

public class calculadorafatorialfunc {
    public int n1;

    public int Calculadora() {
        int i = 1;
        int fat = 1;
        while (i <= n1) {
            fat *= i;
            i++;
        }
        return fat;
    }
}
