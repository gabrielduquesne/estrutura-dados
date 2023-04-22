package br.eu.mavenproject4.newpackage;


public class Bolha {
  public static void main(String[] args) {
        //bolha
        int vetor[] = {6,3,5,1,2};
        boolean controle;
        int aux;

        for(int i=0; i < vetor.length; i++){
            controle=true;
          for (int j=0; j < (vetor.length -1); ++j){

              if(vetor[j] > vetor [j + 1]){
                  aux = vetor[j];
                  vetor[j] = vetor[j + 1];
                  vetor[j + 1] = aux;
                  controle=false;
              }
          } 
          if(controle){
              break;
          }
       }
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "");
        }
    }
}