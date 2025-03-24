package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int nombre = 8128;
        System.out.println("Le nombre " + nombre + " est-t-il parfait ? : " + (estParfait(nombre) ? "Vrai" : "Faux"));

    }
    public static boolean estParfait(int nombre) {

        int sommeDiviseurs = 0;
        for (int i = nombre-1; i >= 1; i--) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;
                System.out.println(i);
            }
        }
        return sommeDiviseurs == nombre;
    }
}
