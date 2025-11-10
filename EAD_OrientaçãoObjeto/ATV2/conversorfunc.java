package OrientacaoAObjeto._2_ConversorDeTemperatura;

public class conversorfunc {
    public String type=" ";

    public String[] vect;
    public String p1;
    public String p3;
    public double temp;

    public double max() {
double result=0;
        if (p1.equalsIgnoreCase("célcius")) {
             result = (temp * 1.8)+ 32;
            System.out.println("A temperatura em fahrenheit é:" + result + "°F");
        } else if (p1.equalsIgnoreCase("fahrenheit")) {
            result = (temp - 32) / 1.8;
            System.out.println("A temperatura em graus celsius é:" + result + "°C");
        }
        return result;
    }
}
