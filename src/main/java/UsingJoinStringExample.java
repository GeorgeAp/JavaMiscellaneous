import java.util.StringJoiner;
import java.util.stream.Collector;

public class UsingJoinStringExample {

    public static Collector<CharSequence, StringJoiner, String> JoinStringsExample(
            CharSequence delimiter){
        return Collector.of(()-> new StringJoiner(delimiter), // supplier
                StringJoiner::add,                            // accumulator
                StringJoiner::merge,                          // combiner
                StringJoiner::toString                        // finisher
        );
    }
}
