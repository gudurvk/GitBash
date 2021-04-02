package Multithreading;

public class WriterThread  extends Thread{
    private Pool pool;
    private String name;
    private int seq;
    private int priority;
    WriterThread(Pool pool,String name,int seq, int priroty)
    {
        this.pool=pool;
        this.name=name;
        this.seq=seq;
        this.priority=priroty;
    }
    public void run()
    {
        Job job =new Job(this.name,this.seq,this.priority);
        pool.addToPool(job);
    }
}
