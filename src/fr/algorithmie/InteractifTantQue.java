package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        System.out.println("Le nombre renseigné est : " + demanderNombre());
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
