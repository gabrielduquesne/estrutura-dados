package br.eu.mavenproject4.newpackage;


import java.util.Arrays;

public class Insertion {
    public void insertionSort(int[] arr) {
        int[] vetor = new int[15];
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
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

        System.out.println(Arrays.toString(arr));
    }
}

