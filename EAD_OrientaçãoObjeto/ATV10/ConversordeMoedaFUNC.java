package EAD.ATV10;

public class ConversordeMoedaFUNC {
    public String dados;
    public double conta;

    public double impressao() {
        String[] dividir = dados.split(" ");
        String moeda = dividir[0].toLowerCase();
        double valor = Double.parseDouble(dividir[1]);
        String moeda_2 = dividir[2].toLowerCase();

        double realDolar = 5.38, realEuro = 6.23, dolarEuro = 0.86;

        if (moeda.equals("real") && moeda_2.equals("dolar")) {
            conta = valor / realDolar;
        } else if (moeda.equals("dolar") && moeda_2.equals("real")) {
            conta = valor * realDolar;
        } else if (moeda.equals("real") && moeda_2.equals("euro")) {
            conta = valor / realEuro;
        } else if (moeda.equals("euro") && moeda_2.equals("real")) {
            conta = valor * realEuro;
        } else if (moeda.equals("dolar") && moeda_2.equals("euro")) {
            conta = valor * dolarEuro;
        } else if (moeda.equals("euro") && moeda_2.equals("dolar")) {
            conta = valor / dolarEuro;
        } else {
            System.out.println("Erro");
            return 0;
        }

        return conta;
    }
}
