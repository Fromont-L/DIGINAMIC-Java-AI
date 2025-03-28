package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int nombreADeviner = genererNombreAleatoire();
        int nombreDonne = 0;

        while (nombreADeviner != nombreDonne) {
            nombreDonne = demanderNombre();
            if (nombreDonne > nombreADeviner) {
                System.out.println("plus petit");
            } else if(nombreDonne < nombreADeviner) {
                System.out.println("plus grand");
            }
        }
        System.out.println("Bravo c'était bien : " + nombreADeviner);
    }

    public static int genererNombreAleatoire() {
        return (int) ((Math.random() * (100 - 1)) + 1);
    }

    public static int demanderNombre() {
        Scanner scanner;
        boolean estValide = false;
        int nb = 0;
        while (!estValide) {
            try {
                System.out.println("Entrez un nombre entre 1 et 100 : ");
                scanner = new Scanner(System.in);
                nb = scanner.nextInt();
                if (nb >= 1 && nb <= 100) {
                    estValide = true;

                } else {
                    System.err.println("Nombre trop grand ou trop petit");
                }
            } catch (NoSuchElementException e) {
                System.err.println("Nombre invalide");
            }
        }
        return nb;
    }
}
