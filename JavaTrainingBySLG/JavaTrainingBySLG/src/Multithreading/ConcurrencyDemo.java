package Multithreading;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Pool pool=new Pool();

        for(int i=0;i<10;i++)
        {
            WriterThread wth=new WriterThread(pool,"Job-"+i,i,i);
            wth.start();
        }
        System.out.println(pool.getCurrentSizeOfPool());
    }
}
