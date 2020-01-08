package initializeHashMapInDifferentWays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    // Initialize a map using Java 8 Stream API
    public static Map<String,String> streamMapInitialize(){
        Map<String, String> map1 = Stream.of(new String[][]{
                {"Hello", "World"},
                {"John", "Doe"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        return map1;
    }
    // In order to make it more generic let's take the array of Objects and perform the same operation:
    public static Map<String, Integer> streamMapInitializeWithObject(){
        Map<String, Integer> map2 = Stream.of(new Object[][]{
                {"Hello", 1},
                {"John", 2},
        }).collect(Collectors.toMap(data ->(String) data[0], data -> (Integer) data[1]));
        return map2;
    }

    public static void main(String[] args) {
        streamMapInitialize().put("Kofi", "Ama");
        streamMapInitializeWithObject().put("Yaw", 1);
        streamMapInitializeWithObject().put("this", 2);
    }



}
