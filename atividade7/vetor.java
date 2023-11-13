package atividade7;

import java.util.Scanner;

public class vetor {public static void main(String[] args) {
    
    
    Scanner ler = new Scanner(System.in);

    int n = 10; //Tamanho do vetor
    int v[] = new int[n]; //Declarando o vetor
    int i; //Posição

    //Laço 'for' para inserção de dados
    for (i=0; i<n; i++) {
      System.out.printf("Informe um valor: ", (i+1), n);
      v[i] = ler.nextInt();
    }

    //Definição de maior e menor vetor + soma dos vetores
    int soma = 0;
    int menor = v[0]; 
    int maior = v[0];
    for (i=0; i<n; i++) {
      soma = soma + v[i];

      if (v[i] < menor)
         menor = v[i];

      if (v[i] > maior)
         maior = v[i];
    }

    //Impressao do resultado final
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (v[i] == menor)
        System.out.printf("v[%d] = %2d  Menor valor\n", i, v[i]);
      else if (v[i] == maior)
              System.out.printf("v[%d] = %2d Maior valor\n", i, v[i]);
           else System.out.printf("v[%d] = %2d\n", i, v[i]);
    }

    System.out.printf("\nSoma = %d\n", soma);
  }

}

