import java.util.*;

public class SortingComparable {

    static class Simpsons implements Comparable<Simpsons>{
        String name;

        public Simpsons(String name){
            this.name = name;
        }

        public int compareTo(Simpsons simpsons){
            return simpsons.name.compareTo(this.name);
            //return this.name.compareTo(simpsons.name);
        }

        public String toString(){
            return this.name;
        }
    }

    public static void main(String[] args){
        Set<Simpsons> set = new TreeSet<>();
        set.add(new Simpsons("Homer"));
        set.add(new Simpsons("Marge"));
        set.add(new Simpsons("Lisa"));
        set.add(new Simpsons("Bart"));
        set.add(new Simpsons("Maggie"));

        List<Simpsons> list = new ArrayList<>();
        list.addAll(set);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
