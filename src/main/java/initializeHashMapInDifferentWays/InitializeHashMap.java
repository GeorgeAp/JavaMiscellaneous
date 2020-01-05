package initializeHashMapInDifferentWays;

import java.util.HashMap;
import java.util.Map;

public class InitializeHashMap {

    //  Initialize a HashMap using a static block of code
    public static Map<String,String> articleMapOne;
    static {
        articleMapOne = new HashMap<>();
        articleMapOne.put("ar01", "Intro to Maps");
        articleMapOne.put("ar02", "Some article");

    /*
    The advantage of this kind of initialization is that the map is mutable
    but it will work only for static. Entries could be added and removed as and when required.
     */
    }

}
