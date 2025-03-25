package fr.algorithmie;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        System.out.println("Le nombre MAX que vous avez saisi est : " + retourneNombreMax());
    }

    public static int retourneNombreMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int nb = demanderNombre();
            if (max < nb) {
                max = nb;
            }
        }
        return max;
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
