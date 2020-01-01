import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args){
        List<Integer> listWithDuplicate = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 0, 0));
        System.out.println("Array with duplicate" + listWithDuplicate);

        // construct new list and remove the duplicates
        List<Integer> listWithNoDuplicate = listWithDuplicate.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List without duplicates" + listWithNoDuplicate);
    }
}
