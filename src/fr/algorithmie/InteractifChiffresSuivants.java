package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        // Avant de voir que la limite entre 1 et 10 n'était plus obligatoire
        //afficherDixNombres(InteractifTableMult.demanderNombre());
        afficherDixNombres(demanderNombre());

    }

    public static void afficherDixNombres(int nb) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(String.valueOf(nb + i));
            if (i < 10) {
                System.out.print(", ");
            }


        }
    }

    public static int demanderNombre() {
        Scanner scanner;
        boolean estValide = false;
        int nb = 0;
        while (!estValide) {
            try {
                System.out.println("Entrez un nombre : ");
                scanner = new Scanner(System.in);
                nb = scanner.nextInt();
                estValide = true;
            } catch (NoSuchElementException e) {
                System.err.println("Nombre invalide");
            }
        }
        return nb;
    }
}
