package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListeArray {

    public static void main(String[] args) {
        // CREAZIONE DI DUE LISTE DI STRINGHE
        final List<String> fruit = new ArrayList<>();
        final List<String> vegetable = new ArrayList<>();

        // AGGIUNTA DI ELEMENTI ALLA LISTA FRUTTA
        fruit.add("mela");
        fruit.add("pera");
        fruit.add("banana");

        // AGGIUNTA DI ELEMENTI ALLA LISTA VERDURA
        vegetable.add("insalata");
        vegetable.add("pomodoro");
        vegetable.add("cipolla");

        // CREAZIONE DI UNA LISTA DI LISTE
        final List<List<String>> fruitVegetable = new ArrayList<>();
        fruitVegetable.add(fruit);
        fruitVegetable.add(vegetable);

        // ITERAZIONE NIDIFICATA: STAMPA DI TUTTI GLI ELEMENTI DELLE LISTE INTERNE
        for (List<String> vegetables : fruitVegetable) {
            for (String vegetablee : vegetables) {
                System.out.println(vegetablee);
            }
        }

        // ITERAZIONE SINGOLA SU UNA LISTA SPECIFICA (FRUTTA)
        for (String fruits : fruit) {
            System.out.println(fruits);
        }

        // ARRAY DI STRINGHE CLASSICO
        String[] people = { "Marco", "Ciccio", "Mario", "Cri" };
        for (String string : people) {
            System.out.println(string);
        }

        // CREAZIONE DI UNA LISTA USANDO ARRAYLIST (JAVA COLLECTIONS FRAMEWORK)
        final List<String> peopleString = new ArrayList<>();
        peopleString.add("Marco");
        peopleString.add("Cri");
        peopleString.add("Lalo");

        // STAMPA DIRETTA DELLA LISTA
        System.out.println(peopleString);

        // CON ENHANCHED FOR
        for (String arrayList : peopleString) {
            System.out.println(arrayList);
        }

        // OTTENERE L'ULTIMO ELEMENTO DELLA LISTA USANDO size() - 1
        final String findIndex = peopleString.get(peopleString.size() - 1);
        System.out.println(findIndex);

        // SOSTITUZIONE DI UN ELEMENTO IN UNA POSIZIONE SPECIFICA
        final String newValue = peopleString.set(0, "giovanni");

        // ITERAZIONE USANDO METHOD REFERENCE
        peopleString.forEach(System.out::println);

        // ITERAZIONE CON ENHANCHED FOR NUOVAMENTE
        for (String peoplee : peopleString) {
            System.out.println(peoplee);
        }

        // RIMOZIONE DI UN ELEMENTO SPECIFICO
        peopleString.remove("Lalo");

        // STAMPA DELLA LISTA DOPO LA RIMOZIONE
        for (String peoplee : peopleString) {
            System.out.println(peoplee);
        }

        // PULIZIA COMPLETA DELLA LISTA
        peopleString.clear();

        // STAMPA DELLA LISTA DOPO CLEAR (NON STAMPA NULLA)
        peopleString.forEach(System.out::println);
    }

    // METODO DI SUPPORTO: STAMPA ELEMENTI DI UN ARRAY
    public static String stampName(String[] array) {
        String result = "";
        for (String string : array) {
            System.out.println(string);
        }
        return result;
    }
}
