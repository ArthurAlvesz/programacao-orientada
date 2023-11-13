package atividade7;

import java.util.LinkedList;

public class linkedList {
    public static void main (String[] args){
        
        //Criando um objeto para LinkedList
        LinkedList<String> linked = new LinkedList<String>();


        //Adicionando elementos na lista com .add()
        linked.add("Gabigol");
        linked.add("Arrascaeta");
        linked.add("Bruno Henrique");
        linked.add("Everton");
        linked.add("Gerson");
        linked.add("Pedro");
        linked.add(1, "Pulgar");


        //Imprimindo na tela a lista de jogadores declarados a cima
        System.out.println("Lista de jogadores:" +linked);


        //Removendo jogador da posição 3 usando o .remove()
        linked.remove(3);

        //Inserindo um novo jogador na posição 3 usando o .add()
        linked.add(3,"Wesley");
        
        //Removendo o ultimo jogador da lista
        linked.removeLast();
        
        //Imprimindo a lista final de jogadores
        System.out.println("Lista final de jogadores:" +linked);
    }
}
