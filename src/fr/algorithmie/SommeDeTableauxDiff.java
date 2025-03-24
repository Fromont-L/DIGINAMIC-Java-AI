package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int maxSize = Math.max(array1.length, array2.length);
        int[] sommeTableau = new int[maxSize];

        for (int i = 0; i < maxSize; i++) {
            int valeur1 = (i < array1.length) ? array1[i] : 0;
            int valeur2 = (i < array2.length) ? array2[i] : 0;
            sommeTableau[i] = valeur1 + valeur2;
        }

        System.out.print("La somme des différents tableaux est la suivante : ");
        for (int valeur : sommeTableau) {
            System.out.print(valeur + " ");
        }
    }
}
