package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int max = Integer.MIN_VALUE; // Le plus grand élément
        int secondMax = Integer.MIN_VALUE; // Le second plus grand élément

        for (int nombre : array) {
            if (nombre > max) {
                secondMax = max;
                max = nombre;
            } else if (nombre > secondMax && nombre < max) {
                secondMax = nombre;
            }
        }

        System.out.println("Le nombre le plus grand est : " + max);
        System.out.println("Le 2ème nombre le plus grand est : " + secondMax);
    }
}
