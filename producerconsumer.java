import java.util.*;

public class producerconsumer{
    public static void main(String[] args) throws InterruptedException {

       final producer obj = new producer();

       Thread t1 = new Thread(new Runnable() {
        @Override
        public void run(){
            try{
                obj.produce();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
       });

       Thread t2 = new Thread(new Runnable() {
        @Override
        public void run(){
            try{
                obj.consume();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
       });

       t1.start();
       t2.start();

       t1.join();
       t2.join();
    }


public static class producer{
    LinkedList<Integer>list = new LinkedList<Integer>();
    int capacity = 2;

    public void produce() throws InterruptedException
    {
    int value = 0;
    while(true){
        synchronized(this)
        {
            while(list.size() == capacity)
                wait();

            System.out.println("Producer Produced :" + value);

            list.add(value++);
            notify();
            Thread.sleep(100);
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){
            synchronized(this)
            {
                while(list.size()==0)
                wait();

                int val = list.removeFirst();

                System.out.println("Consumer Produced: " + val);

                notify();

                Thread.sleep(1000);
            }
        }
    }
}

}