    package br.eu.mavenproject4;


public class Mavenproject4 {

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

   //Ordenação por Seleção 
    public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[15];

        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        int posicao_menor, aux;
        for(int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n\nOrdenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
        //insertion
    
        public class Main {
        public static void main(String[] args) {
        int[] vetor = new int[15];
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        System.out.println("\n\nOrdenado");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}