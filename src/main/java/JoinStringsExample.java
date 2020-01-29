// Creating our own custom Collector

import java.util.Collections;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class JoinStringsExample implements Collector<CharSequence, StringJoiner,String> {

    private final CharSequence delimiter;

    public JoinStringsExample(CharSequence delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public Supplier<StringJoiner> supplier(){
        // creates accumulator object
        return () -> new StringJoiner(this.delimiter);
    }

    @Override
    public BiConsumer<StringJoiner, CharSequence> accumulator(){
        // Shows how new stream elements will be added to the accumulator
        return StringJoiner::add;
    }

    @Override
    public BinaryOperator<StringJoiner> combiner(){
        // Merge different accumulator objects together
        return StringJoiner::merge;
    }

    @Override
    public Function<StringJoiner, String> finisher(){
        // Extracts the final result
        return StringJoiner::toString;
    }

    @Override
    public Set<Characteristics> characteristics(){
        // Special characteristics of the Collector
        return Collections.emptySet();
    }
}

// motivated by lesson from https://medium.com/better-programming/java-stream-collectors-explained-6209a67a4c29