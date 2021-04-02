package Multithreading;


public class Consumer extends  Thread {
    private BoundedBuffer bb;
    Consumer(BoundedBuffer bb)
    {
        this.bb=bb;

    }
    public void run()
    {
        while(bb.ll.size()>bb.minBuf) {
            bb.removeFromBuffer();
        }
    }
}
