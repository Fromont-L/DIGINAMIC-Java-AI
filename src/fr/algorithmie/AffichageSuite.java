package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        // For
        System.out.println("Affiche tous les nombres de 1 à 10");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("Affiche tous les nombres pairs entre 0 et 10");
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        System.out.println("Affiche tous les nombres impairs entre 0 et 9");
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }

        // While
        System.out.println("Affiche tous les nombres de 1 à 10");
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        System.out.println("Affiche tous les nombres pairs de 0 à 10");
        i = 0;
        while (i < 11) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("Affiche tous les nombres impairs de 0 à 9");
        i = 1;
        while (i < 11) {
            System.out.println(i);
            i+=2;
        }

    }
}
