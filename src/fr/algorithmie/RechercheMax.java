package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int max = array[0];

        for (int number : array) {
            max = Math.max(max, number);
        }

        System.out.println("Le nombre le plus grand est : " + max);

    }
}
