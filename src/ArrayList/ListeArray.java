package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListeArray {

    public static void main(String[] args) {
        // CREAZIONE DI DUE LISTE DI STRINGHE
        final List<String> frutta = new ArrayList<>();
        final List<String> verdura = new ArrayList<>();

        // AGGIUNTA DI ELEMENTI ALLA LISTA FRUTTA
        frutta.add("mela");
        frutta.add("pera");
        frutta.add("banana");

        // AGGIUNTA DI ELEMENTI ALLA LISTA VERDURA
        verdura.add("insalata");
        verdura.add("pomodoro");
        verdura.add("cipolla");

        // CREAZIONE DI UNA LISTA DI LISTE
        final List<List<String>> fruttaVerdura = new ArrayList<>();
        fruttaVerdura.add(frutta);
        fruttaVerdura.add(verdura);

        // ITERAZIONE NIDIFICATA: STAMPA DI TUTTI GLI ELEMENTI DELLE LISTE INTERNE
        for (List<String> ortaggi : fruttaVerdura) {
            for (String ortaggio : ortaggi) {
                System.out.println(ortaggio);
            }
        }

        // ITERAZIONE SINGOLA SU UNA LISTA SPECIFICA (FRUTTA)
        for (String frutti : frutta) {
            System.out.println(frutti);
        }

        // ARRAY DI STRINGHE CLASSICO
        String[] persone = { "Marco", "Ciccio", "Mario", "Cri" };
        for (String string : persone) {
            System.out.println(string);
        }

        // CREAZIONE DI UNA LISTA USANDO ARRAYLIST (JAVA COLLECTIONS FRAMEWORK)
        final List<String> personeString = new ArrayList<>();
        personeString.add("Marco");
        personeString.add("Cri");
        personeString.add("Lalo");

        // STAMPA DIRETTA DELLA LISTA
        System.out.println(personeString);

        // CON ENHANCHED FOR
        for (String arrayList : personeString) {
            System.out.println(arrayList);
        }

        // OTTENERE L'ULTIMO ELEMENTO DELLA LISTA USANDO size() - 1
        final String findIndex = personeString.get(personeString.size() - 1);
        System.out.println(findIndex);

        // SOSTITUZIONE DI UN ELEMENTO IN UNA POSIZIONE SPECIFICA
        final String newValue = personeString.set(0, "giovanni");

        // ITERAZIONE USANDO METHOD REFERENCE
        personeString.forEach(System.out::println);

        // ITERAZIONE CON ENHANCHED FOR NUOVAMENTE
        for (String personee : personeString) {
            System.out.println(personee);
        }

        // RIMOZIONE DI UN ELEMENTO SPECIFICO
        personeString.remove("Lalo");

        // STAMPA DELLA LISTA DOPO LA RIMOZIONE
        for (String personee : personeString) {
            System.out.println(personee);
        }

        // PULIZIA COMPLETA DELLA LISTA
        personeString.clear();

        // STAMPA DELLA LISTA DOPO CLEAR (NON STAMPA NULLA)
        personeString.forEach(System.out::println);
    }

    // METODO DI SUPPORTO: STAMPA ELEMENTI DI UN ARRAY
    public static String stampaNomi(String[] array) {
        String result = "";
        for (String string : array) {
            System.out.println(string);
        }
        return result;
    }
}
