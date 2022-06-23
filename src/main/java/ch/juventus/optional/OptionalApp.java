package ch.juventus.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        Optional<String> optional = strings.stream().filter((item) -> item.contains("b")).findAny();
        System.out.println(optional.orElse("Leer"));

        Optional<String> optional2 = strings.stream().filter((item) -> item.contains("z")).findAny();
        System.out.println(optional2.orElse("Not found"));



    }
}
