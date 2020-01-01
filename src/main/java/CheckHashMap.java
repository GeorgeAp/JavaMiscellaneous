import java.util.HashMap;

public class CheckHashMap {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        Object o1 = new Object();
        Object o2 = o1;
        m.put(o1, 1);
        m.put(o2, 2);

        System.out.println("The value of o1 is: " + m.get(o1));
    }
}
