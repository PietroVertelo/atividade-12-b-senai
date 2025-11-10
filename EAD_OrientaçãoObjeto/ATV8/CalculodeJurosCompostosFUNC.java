package EAD.ATV8;

public class CalculodeJurosCompostosFUNC {
    public double taxa;
    public double capital;
    public double tempo1;

    public double CalculadoraJurosCompostos() {
        double montante = 0;

        while (montante == 0) {
            double contataxa = (taxa / 100);
            double conta = (1 + contataxa);
            double tempo = Math.pow(conta, tempo1);

            if (capital != 0) {
                montante = capital * tempo;
                return montante;
            }
        }
        return montante;
    }
}


