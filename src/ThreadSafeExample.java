public class ThreadSafeExample {

    public static void main(String[] args){
        System.out.println(Counter.increment());
    }

    public static class Counter{

        private static int count = 5;
        public static synchronized int increment(){
            count += count;
            return count;
        }
    }
}
