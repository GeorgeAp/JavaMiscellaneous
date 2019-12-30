import java.util.ArrayList;
import java.util.List;

public class Bakery extends Thread {
    int n;

    public Bakery(int n) {
        this.n = n;
    }

    List<Integer> tickets = new ArrayList<>(n); // Ticket for threads in line, n - number of threads
    List<Boolean> entering = new ArrayList<>(n); // True when thread entering in line
    {
        for (int i = 0; i < n; i++)
        {
            tickets.add(0);
            entering.add(false);
        }
    }


    public void lock(int pid) // thread ID
    {
        entering.set(pid, true);
        int max = 0;
        for (int ticket : tickets)
        {
            max = Math.max(max, ticket);
        }
        tickets.set(pid, 1 + max);
        entering.set(pid, false);
        for (int i = 0; i < tickets.size(); ++i)
        {
            if (i != pid)
            {
                while (entering.get(i)) { Thread.yield(); } // Wait while other thread picks a ticket
                while (tickets.get(i) != 0 && ( tickets.get(pid) > tickets.get(i)  ||
                        (tickets.get(pid) == tickets.get(i) && pid > i)))
                { Thread.yield(); }
            }
        }
        // The critical section goes here
    }

    public void unlock(int pid)
    {
        tickets.set(pid, 0);
    }
}
