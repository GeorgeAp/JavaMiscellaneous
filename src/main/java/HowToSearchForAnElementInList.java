import java.util.ArrayList;
import java.util.List;

public class HowToSearchForAnElementInList {

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // using lambda to find element in list
        int a = arr.stream()
                .peek(num -> System.out.println("will filter " + num))
                .filter(x -> x == 2)
                .findFirst()
                .get();
        System.out.println(a);

        System.out.println("-------------------------------------");
        // using normal java
        boolean ans = arr.contains(2);

        if (ans) {
            System.out.println("Contains " + 2);
        }
        else
            System.out.println("Doesn't contain " + 2);
    }
}
