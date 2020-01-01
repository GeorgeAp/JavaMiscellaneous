public class StringBufferJava {

    static String concat(String[] strings){
        String newString = "";
        // basic approach
        for (int i = 0; i < strings.length; i++){
            newString += strings[i];
        }
        return newString;
    }

    public static void main(String[] args){
        String[] strings = new String[]{"Wi", "n", "t", "e", "r", " ", "is", " ", "co", "m", "in", "g!"};
        System.out.println(concat(strings));
    }
}
