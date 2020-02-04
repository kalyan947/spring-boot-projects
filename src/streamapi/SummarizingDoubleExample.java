package streamapi;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizingDoubleExample {
    public static void main(String[] args) {
        Stream<BigDecimal> bigDecimalStream
                =Stream.iterate(BigDecimal.ONE,bigDecimal -> bigDecimal.add(BigDecimal.ONE))
                .limit(10)
                .peek(System.out::println);
        IntSummaryStatistics d=bigDecimalStream.collect(Collectors.summarizingInt(BigDecimal::intValue));
        System.out.println(d);
    }
}
