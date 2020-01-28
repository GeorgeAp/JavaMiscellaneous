import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    Set<String> mySetMethod(){
        Set<String> newSet = new HashSet<>();
        newSet.add("you");
        newSet.add("know");
        newSet.add("I");
        newSet.add("am");
        newSet.add("coming");
        newSet.add("you");
        newSet.add("know");
        return newSet;
    }

    Set<String> sortedSetMethod(Set<String> newSet){
        Set<String> sortedSet = new TreeSet<>(newSet);
        return sortedSet;
    }

    public static void main(String[] args) {
        SetExample setExample = new SetExample();
        Set<String> setToPrint = setExample.mySetMethod();
        System.out.println(setToPrint);

        Set<String> sortedSetToPrint = setExample.sortedSetMethod(setToPrint);
        System.out.println("Sorted Set: " + sortedSetToPrint);

        /*
            Note: caps are sorted first with TreeSet before lowercase
         */
    }
}
