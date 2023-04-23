    package br.eu.mavenproject4;


    import br.eu.mavenproject4.newpackage.Bolha;

    public class Main {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 55, 98, 34, 12, 34, 45, 67};

        Bolha bolha = new Bolha();
        Bolha.bubbleSort(arr);
    }
}
 