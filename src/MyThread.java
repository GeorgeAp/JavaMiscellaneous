/*
This class implements the interface Lock
 */
import java.util.Random;

public class MyThread extends Thread {

    int myId;
    MyLock lock;
    Random random = new Random();

    public MyThread(int id, MyLock lock){
        myId = id;
        this.lock = lock;
    }

    void nonCriticalSection() throws InterruptedException {
        System.out.println(myId + "is not in CS");
        Thread.sleep((long) random.nextInt(1000));
    }

    void CriticalSection() throws InterruptedException{
        System.out.println(myId + " is in CS");
        Thread.sleep((long) random.nextInt(1000));
    }

    public void run(){
        while (true){
            lock.requestCS(myId);
            CriticalSection();
            lock.releaseCS(myId);
            nonCriticalSection();
        }
    }

    public static void main(String[] args) throws Exception{
        MyThread thread[];
        int N = Integer.parseInt(args[0]);
        thread = new MyThread[N];
        Bakery lock = new Bakery(N);
        for (int i = 0; i < N; i++){
            thread[i] = new MyThread(i, (MyLock) lock);
            thread[i].start();
        }

    }

}