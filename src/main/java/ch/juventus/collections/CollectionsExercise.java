package ch.juventus.collections;

import ch.juventus.object.Address;
import ch.juventus.object.Person;

import java.util.*;

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}


public class CollectionsExercise {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        List<String> arrayList = new ArrayList<>();

        // Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        arrayList.add("Hunde");
        arrayList.add("Katze");
        arrayList.add("Maus");
        arrayList.add("Elefant");
        arrayList.add("Giraffe");

        // Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(arrayList.size());

        // Füge ein weiteres Element mit Index 2 hinzu.
        arrayList.add(2, "Fisch");

        // Gib die ganze Liste auf der Konsole aus.
        System.out.println(arrayList);

        // Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        if(arrayList.contains("Katze")){
            System.out.println("Katze ist vorhanden");
        }
        else{
            System.out.println("Katze ist nicht vorhanden");
        }

        // Ein Element lesen via Index.
        System.out.println("Auf Index 2 befindet sich: " + arrayList.get(2));

        // Ein Element löschen via Index
        arrayList.remove(2);

        // Ein Element löschen via String
        arrayList.remove("Katze");

        // Ein Element löschen via Index, das es nicht gibt (was passiert?)
        // arrayList.remove(arrayList.size() + 2); // Index out of bounds exception

        // Ein Element löschen via String, das es nicht gibt (was passiert?)
        arrayList.remove("Affe"); // wird ignoriert

        // Alle Elemente aus der Liste löschen
        arrayList.clear();
    }

    static void linkedList() {
        List<String> list = new LinkedList<>();

        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        list.add("Hunde");
        list.add("Katze");
        list.add("Maus");
        list.add("Elefant");
        list.add("Giraffe");

        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println("Anzahl: " + list.size());

        // TODO: Den Index eines bestimmten Elements finden
        System.out.println("Katze ist auf index: " + list.indexOf("Maus"));

        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        System.out.println("Kein Index: " + list.indexOf("Affe"));

        // TODO: Ein Element via Index lesen
        System.out.println("Via Index 1 : " + list.get(1));

        // TODO: Das erste und letzte Element der Liste ausgeben
        System.out.println("first element: " + list.get(0));
        System.out.println("last element: " + list.get(list.size() - 1));

        // TODO: Das erste und letzte Element der Liste löschen
        list.remove(0);
        list.remove(list.size() - 1);

        System.out.println(list);
    }

    static void hashSet() {
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> hashSet = new HashSet<>();

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        Person harald = new Person("Harald", "Schröder", 33, true, new Address("leck mich", 2, 2222, "Ach meno"));
        Person harald2 = new Person("Harald", "Schröder", 33, true, new Address("leck mich", 2, 2222, "Ach meno"));
        hashSet.add(harald);
        hashSet.add(harald2);
        hashSet.add(new Person("Bernd", "das Brot", 33, true, new Address("was mach ich", 2, 2222, "Ach meno")));
        hashSet.add(new Person("Harald", "Schrader", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println("Das HashSet hat Inhalt: " + !hashSet.isEmpty());

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("Länge: " + hashSet.size());

        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        System.out.println("Existiert: " + hashSet.contains(harald2));

        // TODO: Lösche ein bestimmtes Element aus dem Set
        System.out.println(hashSet);
        hashSet.remove(harald2);
        System.out.println("Harald2 ist weg :( : " + !hashSet.contains(harald2));

        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?

        System.out.println(hashSet);
    }

    static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        Set<Person> map = new LinkedHashSet<>();
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        map.add(new Person("Harald", "Schrader", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Velo", "Weg", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Velo", "Weg", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Irgendwas", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println(map.isEmpty());
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(map.size());
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(map);
        System.out.println(map);
        System.out.println(map);
        System.out.println(map);
    }

    static void treeSet() {
        Person petra = new Person("Petra", "Petra", 33, true, new Address("toast mich", 2, 2222, "Ach meno"));
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        Set<Person> map = new TreeSet<>(new PersonComparator());
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        map.add(new Person("Irgendwas", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.add(petra);
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("size: " + map.size());
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(map);
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)


        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        Map<Integer, Person> map = new LinkedHashMap<>(5, .75f, true);

        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        map.put(0, new Person("Bernd", "das Brot", 33, true, new Address("was mach ich", 2, 2222, "Ach meno")));
        map.put(1, new Person("Harald", "Schrader", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(1, new Person("Velo", "Weg", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(2, new Person("Hallo", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(2, new Person("Irgendwas", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(3, new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));

        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println(map);

        // TODO: Greife auf mehrere Elemente zu
        System.out.println(map.get(0));

        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
        System.out.println(map);
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        Map<Integer, Person> map = new TreeMap<>();

        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        map.put(2, new Person("Irgendwas", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(0, new Person("Bernd", "das Brot", 33, true, new Address("was mach ich", 2, 2222, "Ach meno")));
        map.put(1, new Person("Velo", "Weg", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(3, new Person("Hans", "Meier", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(2, new Person("Hallo", "Velo", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));
        map.put(1, new Person("Harald", "Schrader", 33, true, new Address("toast mich", 2, 2222, "Ach meno")));

        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
        System.out.println(map);
    }

}