package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;

public class Executavel {
    public static void main (String[] args){

        Engenheiro eng1 = new Engenheiro("Joab", 123, 99999999, "123", "Lua");
        Gerente ger1 = new Gerente("Puto", 777, 11111111, 10);
        Diretor dir1 = new Diretor("Alberto", 999, 22222222, 9);

        System.out.println(eng1);
        System.out.println(ger1);
        System.out.println(dir1);
    }
}
