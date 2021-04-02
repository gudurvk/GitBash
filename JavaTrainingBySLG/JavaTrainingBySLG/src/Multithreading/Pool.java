package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Pool {
    private Queue<Job> pool=new LinkedList<>();
    Pool(){}
    public void addToPool(Job job){
        this.pool.add(job);
    }
    public Job removeFromPool(){
        return this.pool.remove();
    }
    public int getCurrentSizeOfPool(){
        return this.pool.size();
    }
}
