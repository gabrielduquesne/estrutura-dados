    package br.eu.mavenproject4;


    import br.eu.mavenproject4.newpackage.Bolha;
    import br.eu.mavenproject4.newpackage.Insertion;
    import br.eu.mavenproject4.newpackage.Selection;

    public class Main {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 55, 98, 34, 12, 34, 45, 67};

        Bolha bolha = new Bolha();
        Bolha.bubbleSort(arr);

        Insertion insertion = new Insertion();
        insertion.insertionSort(arr);

        Selection selection = new Selection();
        selection.selectionSort(arr);
    }
}
 