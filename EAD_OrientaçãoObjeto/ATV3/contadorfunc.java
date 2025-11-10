package OrientacaoAObjeto._3_ContadorDePalavras;

public class contadorfunc {
    public String texto;

    public String[] frases;


    public String max() {

        int i = 0;
        int contador = 0;

        while (i < frases.length) {
            for (int cont = 0; cont < frases[i].length(); cont++) {
                contador++;
            }
            i++;
        }

        String resp = "Quantidade de palavras " + contador;
        return resp;
    }

}
