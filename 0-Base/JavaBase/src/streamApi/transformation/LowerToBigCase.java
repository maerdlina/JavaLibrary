package streamApi.transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerToBigCase {
    public static void main(String[] args) {
        List<String> strokes = new ArrayList<String>(
                Arrays.asList("CaSe", "Base", "BIGlow")
        );

        List<String> end = strokes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(end);
    }
}
