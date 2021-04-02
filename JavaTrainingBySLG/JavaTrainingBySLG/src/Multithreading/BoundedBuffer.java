package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    int minBuf;
    int maxBuf;
    Queue<Integer> ll=new LinkedList<>();
    BoundedBuffer(int minBuf,int maxBuf)
    {
        this.minBuf=minBuf;
        this.maxBuf=maxBuf;
    }
    public void addToBuffer(int item)
    {
        ll.add(item);
    }
    public void removeFromBuffer()
    {
        ll.remove();

    }
}

