package streamApi.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLengthMoreThenFive {
    public static void main(String[] args) {
        List<String> strokes = new ArrayList<String>(
                Arrays.asList("hello", "no",
                        "moreThenFive", "less",
                        "giocco", "Marcello")
        );

        List<String> lists = strokes.stream()
                .filter(stroke -> stroke.length() > 5)
                .collect(Collectors.toList());

        System.out.println(lists);
    }
}
