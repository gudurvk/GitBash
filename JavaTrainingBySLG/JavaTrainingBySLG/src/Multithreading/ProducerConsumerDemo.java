package Multithreading;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        BoundedBuffer bb=new BoundedBuffer(2,6);
        Producer t1=new Producer(bb);
        t1.run();

        System.out.println(bb.ll);
        Consumer t2=new Consumer(bb);
        t2.run();
        System.out.println(bb.ll);




    }
}

