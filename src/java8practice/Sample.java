package java8practice;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Sample {

    public static int transform(int e){
        System.out.println( "transform : "+e +"--"+Thread.currentThread());
        return e;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20);
        Stream<Integer> stream=
        numbers.stream()
                .parallel()
                .map(Sample::transform);
        process(stream);
        System.out.println("DONE " +Thread.currentThread());
    }

    private static void process(Stream<Integer> stream) throws InterruptedException {
        ForkJoinPool pool=new ForkJoinPool(5);
        pool.submit(()->stream.forEach(e->{}));
        pool.shutdown();
        pool.awaitTermination(30, TimeUnit.SECONDS);
    }

}
