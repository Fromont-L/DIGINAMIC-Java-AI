package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 2};
        int dernierListe = array.length-1;
        if (array.length >= 1 && (array[0] == array[dernierListe])) {
            System.out.println("La liste commence et se termine par le même nombre");
        } else {
            System.out.println("La liste ne commence pas et ne se termine pas par le même nombre");
        }
    }
}
