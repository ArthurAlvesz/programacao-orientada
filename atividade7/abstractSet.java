package atividade7;

import java.util.*;

public class abstractSet {
    public static void main(String[] args) throws Exception
    {
        //  'Try' para lidar com erros e exceções sem interromper o fluxo normal do programa
        try {
 
            // Criando um objeto para o AbstractSet
            AbstractSet<String> absset = new TreeSet<String>();
 
            // Preenchendo com o método .add()
            absset.add("Fabio");
            absset.add("Pedro");
            absset.add("Jorge");
            absset.add("Carlos");
            absset.add("Joao");
 
            // Mostrando os elementos gravados na lista
            System.out.println("Lista de jogadores: " + absset);
        }
 
        // Lança as exceções capturadas em no 'Try'
        catch (Exception e) {
 
            // Imprime a exceção no console
            System.out.println(e);
        }
    }
}

