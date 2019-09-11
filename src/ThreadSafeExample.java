public class ThreadSafeExample {

    public static void main(String[] args){
        Counter.increment();
    }

    public synchronized void Counter{
        private int count = 0;

        public int increment(){
            count += count;
            return count;
        }

    }
}
