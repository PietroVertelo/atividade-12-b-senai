package EAD.ATV9;

public class ClassificadordeIdadeFUNC {
    public int idade;

    public String ClassificadorIdade() {
        String classe= " ";
        if (idade!=0 && idade<=12) {
            classe = "Infantil";
        } else if (idade!=0 && idade>=13 && idade<18) {
            classe= "Adolescente";
        } else if (idade!=0 && idade>=18 && idade<60) {
            classe = "Adulto";
        } else if (idade!=0 && idade>=60) {
            classe = "Idoso";
        }
        return classe;

    }


}

