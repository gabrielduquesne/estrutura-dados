    package br.eu.mavenproject4;


    import br.eu.mavenproject4.newpackage.Bolha;
    import br.eu.mavenproject4.newpackage.Insertion;
    import br.eu.mavenproject4.newpackage.Selection;

    public class Main {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 55, 98, 34, 12, 34, 45, 67};

        long startTime = System.currentTimeMillis();
        Bolha bolha = new Bolha();
        Bolha.bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Bubble Sort: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        Insertion insertion = new Insertion();
        insertion.insertionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Insertion Sort: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        Selection selection = new Selection();
        selection.selectionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução do Selection Sort: " + (endTime - startTime) + " ms");
    }
}
 