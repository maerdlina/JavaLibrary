package streamApi.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> lenghts = new ArrayList<>(Arrays.asList(
                "long", "dshfjhdsj", "ko", "djfd"
        ));
        List<String> sorted = lenghts.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
