package br.eu.mavenproject4.newpackage;


import java.util.Arrays;

public class Bolha {
  public static void bubbleSort(int[] arr) {
        for(int i=0; i < arr.length - 1; i++) {
          for (int j=0; j < arr.length - 1; ++j) {
              if(arr[j] > arr [j + 1]) {
                  int aux = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = aux;
              }
          }
       }
        
        System.out.println(Arrays.toString(arr));
    }
}