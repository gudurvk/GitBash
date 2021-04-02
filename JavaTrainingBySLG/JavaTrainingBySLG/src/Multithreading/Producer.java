package Multithreading;

public class Producer extends Thread {
    private BoundedBuffer bb =new BoundedBuffer(2,6);
    Producer p;
    Producer(BoundedBuffer bb)
    {
        this.bb=bb;

    }
    public void run()
    {
        int i=0;
        while(true) {
            if(bb.ll.size()<=bb.maxBuf)
                bb.addToBuffer(i++);
            else
            {
                Consumer t2=new Consumer(bb);
                t2.run();
            }

        }
    }
}
