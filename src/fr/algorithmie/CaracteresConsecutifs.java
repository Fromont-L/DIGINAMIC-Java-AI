package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String chaine = "Cela fonctionne avec 111 88888 0 1 ? Et même les espaces      !!!";
        String resultat = transformerChaine(chaine);

        System.out.println(resultat);

    }

    public static String transformerChaine(String input) {
        // Permet de vérifier si la chaine n'est pas vide et d'éviter une erreur
        if (input == null || input.isEmpty()) {
            return "";
        }

        String resultat = "";
        int compteur = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                compteur++;
            } else {
                // Ajouter une chaîne de caractère vide pour convertir le type en String
                resultat += input.charAt(i - 1) + "" + compteur;
                compteur = 1;
            }
        }

        resultat += input.charAt(input.length() - 1) + "" + compteur;

        return resultat;
    }
}
