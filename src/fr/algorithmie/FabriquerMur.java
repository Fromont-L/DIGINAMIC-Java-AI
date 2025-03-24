package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {

        // Tests de vérification

        verifier(3, 1, 8, true);

        verifier(3, 1, 9, false);

        verifier(3, 2, 10, true);

        verifier(3, 2, 8, true);

        verifier(3, 2, 9, false);

        verifier(6, 1, 11, true);

        verifier(6, 0, 11, false);

        verifier(1, 4, 11, true);

        verifier(0, 3, 10, true);

        verifier(1, 4, 12, false);

        verifier(3, 1, 7, true);

        verifier(1, 1, 7, false);

    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {

        final int small = 1;
        final int big = 5;
        int total = 0;
        for (int i = 1; i <= nbBig; i++) {
            if (total + big <= longueur) {
                total += big;
            }
        }
        for (int j = 1; j <= nbSmall ; j++) {
            if (total + small <= longueur) {
                total += small;
            }
        }

        return total == longueur;

    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {

        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {

            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");

        } else {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") Passant.");
        }

    }

}