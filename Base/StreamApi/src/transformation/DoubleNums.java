package transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleNums {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 3, 4, 10, 43, 80)
        );

        List<Integer> end = numbers.stream()
                .map(number -> number*2)
                .collect(Collectors.toList());

        System.out.println(end);
    }
}
