package OrientaçãoObjeto._7_NumeroPrimo;

public class numeroPrimo_função {
    public int h;
    public int n;

    public static boolean dividir(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // encontrou divisor → não é primo
        }

        return true; // nenhum divisor encontrado → é primo
    }

    public static boolean prim(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return false;
    }
}




