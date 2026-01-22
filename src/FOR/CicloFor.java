package FOR;

public class CicloFor {
    public static void main(String[] args) throws Exception {
        // TEST METODO isPalindrome
        System.out.println(isPalindrome("ciao")); // false
        System.out.println(isPalindrome("abba")); // true

        // TEST METODO minMax
        int[] num = { 1, 2, 3, 4, 5, -1 };
        for (int i : minMax(num)) { // ritorna array con {max, min}
            System.out.println(i);
        }

        // TEST METODO oddOrEven
        System.out.println(oddOrEven(2)); // Pari
    }

    // ===============================================
    // METODO: VERIFICA SE UNA PAROLA È PALINDROMA
    // ===============================================
    public static boolean isPalindrome(String parola) {
        char[] parolaInvertita = parola.toCharArray(); // trasformo stringa in array di caratteri
        char[] result = new char[parolaInvertita.length]; // array per contenere parola invertita
        char[] parolaDritta = parola.toCharArray(); // array della parola originale
        int j = 0;
        boolean isPal = true;

        // ciclo al contrario per invertire la parola
        for (int i = parolaInvertita.length - 1; i >= 0; i--) {
            result[j++] = parolaInvertita[i];
        }

        // confronto carattere per carattere
        for (int i = 0; i < parolaDritta.length; i++) {
            if (result[i] != parolaDritta[i]) {
                isPal = false; // se anche un carattere non coincide, non è palindroma
            }
        }

        return isPal;
    }

    // ===============================================
    // METODO: CONTA QUANTE VOLTE UN CARATTERE APPARE IN UNA STRINGA
    // ===============================================
    public static int countTime(String parola, char character) {
        int count = 0;
        char[] array = parola.toCharArray(); // trasformo in array per iterare
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                count++; // incremento contatore se c'è corrispondenza
            }
        }
        return count;
    }

    // ===============================================
    // METODO: VERIFICA SE UN NUMERO È PARI O DISPARI
    // ===============================================
    public static String oddOrEven(int number) {
        String odd = "Pari";
        String even = "Dispari";
        // operatore ternario per controllare il modulo 2
        String result = number % 2 == 0 ? odd : even;
        return result;
    }

    // ===============================================
    // METODO: TROVA IL MASSIMO E IL MINIMO IN UN ARRAY DI INTERI
    // ===============================================
    public static int[] minMax(int[] number) {
        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i]; // aggiorna massimo
            } else if (number[i] < min) {
                min = number[i]; // aggiorna minimo
            }
        }

        int[] arrayResult = new int[] { max, min }; // ritorna array {max, min}
        return arrayResult;
    }

    // ===============================================
    // METODO: INVERTI UNA STRINGA
    // ===============================================
    public static String invertiStringa(String parola) {
        char[] parolaInvertita = parola.toCharArray(); // trasformo in array
        String result = "";

        // ciclo al contrario per costruire la stringa invertita
        for (int i = parolaInvertita.length - 1; i >= 0; i--) {
            result += parolaInvertita[i];
        }

        return result;
    }

    // ===============================================
    // METODO DI SUPPORTO: STAMPA GLI ELEMENTI DI UN ARRAY DI STRINGHE
    // ===============================================
    public static String stampaNomi(String[] array) {
        String result = "";
        for (String string : array) {
            System.out.println(string);
        }
        return result;
    }

}
