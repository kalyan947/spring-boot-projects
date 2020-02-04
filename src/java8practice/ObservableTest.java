package java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObservableTest {

    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6};
        List<Integer> a1= Arrays.asList(1,3,5,7);
        List<Integer> a2= Arrays.asList(2,4,6);
        System.out.println(
        a1.stream()
                .flatMap(i -> a2.stream()
                        .map(j -> new ArrayList().add(i+"-"+j))
                )
                .collect(Collectors.toList()));
    }


}
