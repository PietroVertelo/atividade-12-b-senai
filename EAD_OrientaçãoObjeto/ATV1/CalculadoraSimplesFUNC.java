package EAD.ATV1;

public class CalculadoraSimplesFUNC {
    public int n1;
    public int n2;
    public String operacao;
    public int calculadora(){
        int resp=0;
        if (operacao.equalsIgnoreCase("somar")) {
            resp=(n1 + n2);

        } else if (operacao.equalsIgnoreCase("subtrair")) {
            resp=(n1-n2);

        } else if (operacao.equalsIgnoreCase("multiplicar")) {
            resp=(n1*n2);

        }if (operacao.equalsIgnoreCase("dividir")){
            resp=n1/n2;
        }return resp;
    }



}
