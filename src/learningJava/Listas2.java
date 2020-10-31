package learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Gabriela");
        list.add("Sofia");
        list.add("Laura");
        list.add("Victor");

        for (String x : list)
            System.out.println(x);
        System.out.println("List size: " + list.size() + "\n");

        list.add(1, "Thor");
        for (String x : list)
            System.out.println(x);
        System.out.println("List size: " + list.size() + "\n");


        list.remove("Laura");
//        list.remove(1);
        for (String x : list)
            System.out.println(x);
        System.out.println("List size: " + list.size() + "\n");

        list.removeIf(x -> x.charAt(0) == 'V');
        for (String x : list)
            System.out.println(x);
        System.out.println("List size: " + list.size() + "\n");

        System.out.println("Index of Thor: " + list.indexOf("Thor") + "\n");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        for (String x : result)
            System.out.println(x);
        System.out.println("List size: " + result.size() + "\n");

        String namePosition = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
        System.out.println("First 'S' on the list: " + namePosition);

    }
}
