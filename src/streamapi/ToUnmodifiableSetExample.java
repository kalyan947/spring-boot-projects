package streamapi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class ToUnmodifiableSetExample {
    public static void main(String[] args) {
        System.out.println(
        IntStream.iterate(1,i->i+1).limit(10)
                .boxed()
                .collect(Collectors.groupingBy(ToUnmodifiableSetExample::add
                        , mapping(ToUnmodifiableSetExample::mul,toList())))
        );
    }

    public static int mul(int n){
        return n*2;
    }
    public static int add(int n){
        return n+2;
    }
}
