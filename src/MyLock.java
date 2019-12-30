/*
This is an interface for Mutual Exclusion Problem in a concurrent data sharing program
Lock ensure that the Critical Section (CS) is executed atomically to ensure that no update is lost
 */

public interface MyLock {

    public void requestCS(int pid); // this may block
    public void releaseCS(int pid);

}
