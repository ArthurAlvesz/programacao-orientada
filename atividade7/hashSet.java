package atividade7;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){

        //Criando um objeto para a lista de itens com Hash
        HashSet<String> frutas = new HashSet<String>();


        //Adicinando itens a lista com .add()
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Pêra");
        frutas.add("Uva");
        frutas.add("Melancia");
        frutas.add("Goiaba");

        //Imprimindo lista inicial 
        System.out.println("Essa é a lista de frutas disponíveis:" + frutas);
        
        //Usando operadores lógicos para verificar se tem 'Banana' na lista
        System.out.println(frutas.contains("Banana")?"Tem banana":"Não tem banana");
        
        //Removendo 'Maça' da lista com o .remove()
        frutas.remove("Maça");
       
       //Imprimindo lista atualizada de frutas
        System.out.println("Lista de frutas atualizada:" + frutas);
        
        //Verificação com 'If' e 'Else' para conferir se a 'Maça' ainda está na lista
        if(frutas.contains("Maça")){
            System.out.println("Ainda possui maça!");
        }else{
            System.out.println("Acabou a maça :(");
        }
    }
}
