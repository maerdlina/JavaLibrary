package streamApi.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterForEvenNums {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
        );

        List<Integer> evenNums = nums.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNums);
    }
}
