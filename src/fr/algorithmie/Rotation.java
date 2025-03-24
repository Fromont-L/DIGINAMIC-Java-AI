package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.print("Avant rotation : ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;

        System.out.print("\nAprès rotation : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
