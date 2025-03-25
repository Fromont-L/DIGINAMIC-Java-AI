package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        afficherTable(demanderNombre());
    }

    public static void afficherTable(int nb) {
        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {

            System.out.println(nb + " * " + i + " = " + nb * i);
        }
    }

    public static int demanderNombre() {
        Scanner scanner;
        boolean estValide = false;
        int nb = 0;
        while (!estValide) {
            try {
                System.out.println("Entrez un nombre entre 1 et 10 : ");
                scanner = new Scanner(System.in);
                nb = scanner.nextInt();
                if (nb >= 1 && nb <= 10) {
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
