import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args){
        HashMap m = new HashMap();
        Object o1 = new Object();
        Object o2 = o1;
        m.put(o1, 1);
        System.out.println("here is o1: "+ m.get(o1));
        m.put(o2, 3);

        System.out.println("here is o1 after o2: "+ m.get(o1));
    }
}
