import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public Set<Integer> a = new HashSet<>();
    public Set<Integer> b = new HashSet<>();

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

    Set<Integer> unionSetOperation(){
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        return union;
    }

    Set<Integer> intersectionSetOperation(){
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        return intersection;
    }

    Set<Integer> differenceSetOperation(){
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        return difference;
        // outputs a|b
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
        setExample.a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        setExample.b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 6, 0, 7, 5}));

        System.out.println("Set a: " + setExample.a);
        System.out.println("Set b: " + setExample.b );

        System.out.println("Union set: " + setExample.unionSetOperation());

        System.out.println("Intersection set: " + setExample.intersectionSetOperation());

        System.out.println("Difference set: " + setExample.differenceSetOperation());

    }
}
