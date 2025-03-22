package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Affiche l'ensemble des éléments du tableau 'array'");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }

        System.out.println("\nAffiche l'ensemble des éléments du tableau copié 'arrayCopy' dans l'autre sens");
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = arrayCopy.length - 1; i >= 0 ; i--) {
            arrayCopy[arrayCopy.length - (i + 1)] = array[i];
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.printf(arrayCopy[i] + " ");
        }
        
    }
}
