import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FinanceApp {

    public static void main(String[] args){
        /*
        Stream<String> currencies = Stream.of("GBP", "EUR", "USD", "CAD", "AUD", "JPY", "HKD");
        // create a Lambda function to print currencies
        currencies.forEach(currency -> System.out.println(currency));

        System.out.println(" ");

        Stream<String> currencie = Stream.of("GBP", "EUR", "USD", "CAD", "AUD", "JPY", "HKD");
        currencie
                .filter(currency -> currency.matches("GBP|GHC"))
                .forEach(System.out::println);

        System.out.println(" ");

        Stream<String> currenciez = Stream.of("GBP", "EUR", "USD", "CAD", "AUD", "JPY", "HKD");
        currenciez
                .filter(currency -> currency.contains("A"))
                .forEach(System.out::println);

        //Trades tradeData = C24.parse(Trades.class).from(new File("tradedata.csv"));
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("tradedata.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        ArrayList<String> tradesList = new ArrayList<>();
        Stream<Trade> tradeStream = tradesList.stream();
        tradeStream.forEach(System.out::print);


         */


    }

}
