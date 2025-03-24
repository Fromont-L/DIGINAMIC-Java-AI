package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        if (array1.length != array2.length) {
            System.out.println("Les tableaux n'ont pas la même taille");
            return;
        }

        int[] sommeTableaux = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sommeTableaux[i] = array1[i] + array2[i];
        }

        System.out.print("Somme des deux tableaux est la suivante : ");
        for (int i = 0; i < sommeTableaux.length; i++) {
            System.out.print(sommeTableaux[i]);
            if (i < sommeTableaux.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
