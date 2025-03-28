package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        System.out.println(calculerSommeDe1JusquA(demanderNombre()));
    }

    public static int calculerSommeDe1JusquA(int nb) {
        int somme = 0;
        for (int i = 1; i <= nb; i++) {
            somme += i;
        }
        return somme;
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
