public class StringEquality {

    static boolean isFoo(String param){
        if(param.equals("foo")){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isFoo("foo"));
    }
}
