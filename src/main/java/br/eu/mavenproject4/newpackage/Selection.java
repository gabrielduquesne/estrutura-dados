package br.eu.mavenproject4.newpackage;


import java.util.Arrays;

public class Selection {
    public void selectionSort(int[] arr) {
        int posicao_menor, aux;
        for (int i = 0; i < arr.length - 1; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = arr[posicao_menor];
            arr[posicao_menor] = arr[i];
            arr[i] = aux;
        }
        System.out.println(Arrays.toString(arr));
    }
}
