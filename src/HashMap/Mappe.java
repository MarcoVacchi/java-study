package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mappe {

    public static void main(String[] args) {

        // PRIMA DI INIZIARE UN ATTIMO DI RIPASSO;
        // LA FORMATTAZIONE

        // %s Stringa / oggetto con toString() ES: "Marco"
        // %d Numero intero decimale ES: 25
        // %f Numero decimale con virgola ES: 3.14
        // %n Vai a capo (newline)

        final Map<Integer, String> mappaMaschi = new HashMap<>();

        mappaMaschi.put(2, "Marco");
        mappaMaschi.put(44, "Giorgio");
        mappaMaschi.put(42, "Francesco");

        final Map<Integer, String> mappaFemmine = new HashMap<>();
        mappaFemmine.put(21, "Maria");
        mappaFemmine.put(1, "Jessica");
        mappaFemmine.put(22, "Nina");

        final Map<Integer, String> mappaPersone = new HashMap<>();

        // SBAGLIATI, IN JAVA NON SI POSSONO PASSARE COME COSTRUTTORI DUE MAPPE,
        // POSSIAMO FARE COME NELL'ESEMPIO SOTTO

        // Map<Integer, String> mappaPersone = new HashMap<>(mappaFemmine, mappaMaschi);
        // Map<Integer, String> mappaPersone = new HashMap<>(mappaMaschi);
        // Map<Integer, String> mappaPersone = new HashMap<>(mappaFemmine);

        // SBAGLIATI, IN JAVA NON SI POSSONO PASSARE COME COSTRUTTORI DUE MAPPE,
        // POSSIAMO FARE COME NELL'ESEMPIO SOTTO

        // Map<Integer, String> mappaPersone = new HashMap<>(mappaFemmine);
        // mappaPersone.putAll(mappaMaschi); // METHOD 1
        mappaPersone.putAll(mappaFemmine); // METHOD 2
        mappaPersone.putAll(mappaMaschi);
        System.out.println(mappaPersone); // STAMPA MASCHI E FEMMINE

        // SE LA CHIAVE CORRISPONDE O ESISTE, RESTITUIRA' TRUE ALTIRMENTI FALSE
        System.out.println("La mappa contiene questa chiave? " + mappaPersone.containsKey(20)); // RESTITUISCE FALSE

        System.out.println("La mappa contiene questa chiave? " + mappaPersone.containsKey(22)); // RESTITITUISCE TRUE

        // PER RIMUOVERE POSSIAMO UTILIZZARE IL METODO REMOVE, UTILIZZANDO LA KEY
        // CORRISPONDENTE, OPPURE CLEAR PER RIMUOVERE TUTTO INSIEME

        mappaPersone.remove(22);
        System.out.println("La mappa contiene questa chiave? " + mappaPersone.containsKey(22));
        // ORA REST FALSE, A DIFFERENZA DI PRIMA, PERCHE' RIMOSSA

        // METODO .SIZE() MI REST LA LUNGHEZZA DELLA MAPPA
        System.out.println(mappaPersone.size()); // RISULTATO 5

        // POSSIAMO UTILIZZARE REPLACE, PER RIMPIAZZARE UN VALORE
        mappaPersone.replace(21, "Gianni");
        // System.out.println(mappaPersone);

        /////////////////////// ITERAZIONI //////////////////////////

        // FOREACH CLASSICO UTILIZZANDO METODO VALUES()
        // for (String nome : mappaPersone.values()) {
        // System.out.println(nome);
        // }

        // CON ITERATOR
        System.out.println("\n===== ITERATOR =====\n");

        final Iterator<Integer> iterator = mappaPersone.keySet().iterator();

        while (iterator.hasNext()) {
            Integer nextKey = iterator.next();
            System.out.printf(" Key is: %d, Value is: %s ", nextKey, mappaPersone.get(nextKey)); // FORMAT

            // System.out.printf("Key is: %s, value is: %s%n", nextKey,
            // mappaPersone.get(nextKey)); // METODI ALTERNATIVI PER ANDARE A CAPO CON %s%n
            System.out.println("           ");

            // OPPURE CLASSICO PRINTLN
            // System.out.println("Key is: " + key + "Value is: " + mappaPersone.get(key));
        }

        // CON ENHANCHED FOR

        System.out.println("\n===== CON ENHANCHED FOR =====\n");

        for (Integer key : mappaPersone.keySet()) {
            System.out.printf(" Key is: %d, Value is: %s ", key, mappaPersone.get(key)); // FORMAT
            System.out.println("           ");

            // OPPURE CLASSICO PRINTLN
            // System.out.println("Key is: " + key + "Value is: " + mappaPersone.get(key));
        }

        // CON LAMBDA E STREAM, METODO PIU UTILIZZATO
        System.out.println("\n======== CON LAMBDA E STREAM =======\n");

        mappaPersone.keySet().forEach(key -> {
            System.out.printf("Key is: %d, Value is: %s ", key, mappaPersone.get(key));
            System.out.println("           ");
            // OPPURE CLASSICO PRINTLN
            // System.out.println("Key is: " + key + "Value is: " + mappaPersone.get(key));
        });

        // CON TREEMAP
        //// DIFFERENZA IMPORTANTA FRA HASHMAP E THREEMAP
        // THREEMAP GARANTISCE LE CHIAVI ORDINATE
        /// NUMERICAMENTE O ALFABETICAMENTE SE STRINGHE
        System.out.println("\n======== CON LAMBDA E STREAM MA TREEMAP =======\n");

        Map<Integer, String> mappaOrdinata = new TreeMap<>(mappaPersone); // UTILIZZO COSTRUCTOR MOD PER SEMPLICITÁ
        mappaOrdinata.keySet().forEach(key -> {
            System.out.printf("Key is: %d, Value is: %s ", key, mappaOrdinata.get(key));
            System.out.println("           ");
        });

    }

}
