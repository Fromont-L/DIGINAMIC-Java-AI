package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 2};
        int dernierListe = array.length-1;
        if (array.length >= 1 && (array[0] == 6 || array[dernierListe] == 6)) {
            System.out.println("La liste commence ou se termine par 6");
        } else {
            System.out.println("La liste ne commence pas ou ne se termine pas par 6");
        }
    }
}
