package atividade7;

import java.util.*;
 
public class abstractList {
    public static void main(String args[])
    {
 
        // Criando um objeto para AbstractList 
        AbstractSequentialList<String> abslist = new LinkedList<String>();
 
        // Preenchendo a lista com o método .add()
        abslist.add("Ferrari");
        abslist.add("Porsche");
        abslist.add("Mercedes");
        abslist.add("BMW");
        abslist.add("McLaren");
 
        // Imprimindo a lista
        System.out.println("Lista de carros: "
                           + abslist);
 
        // Removendo itens da lista utilizando .remove()
        abslist.remove(4);
 
        // Imprimindo a lista final pós alteração
        System.out.println("Lista Final: " + abslist);
 
        // Selecionando um elemento específico da lista com o .get()
        System.out.println("O carro escolhido foi: " + abslist.get(2));
    }
}


