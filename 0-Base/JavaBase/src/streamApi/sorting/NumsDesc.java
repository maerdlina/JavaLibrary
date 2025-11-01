package streamApi.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumsDesc {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 10, 8, 90, 12, 45));

        List<Integer> numsDesc = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(numsDesc);
    }
}
