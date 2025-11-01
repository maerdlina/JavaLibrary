package streamApi.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPositiveNums {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(
                Arrays.asList(-1, 2, 3, 4, -10, 0)
        );

        List<Integer> lists = nums.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());

        System.out.println(lists);
    }
}
