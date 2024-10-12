class MyThread extends Thread {
    public static void main(String[] args) throws InterruptedException{
        SumUpExample.runTest();
    }
}

class SumUpExample {
    long startRange;
    long endRange;
    long counter =0;
    static long MAX_NUM = Integer.MAX_VALUE;

    public SumUpExample(long startRange, long endRange){
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public void run(){
        for(long i = startRange; i <= endRange; i++){
            counter += i;
            }
        }

        static public void twoThreads() throws InterruptedException{
            long start = System.currentTimeMillis();
            SumUpExample thread1 = new SumUpExample(1, MAX_NUM/2);
            SumUpExample thread2 = new SumUpExample(1+(MAX_NUM/2),MAX_NUM);

            Thread t1 = new Thread(() -> {
                thread1.add();
            });

            Thread t2 = new Thread(() ->{
                thread2.add();
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            long finalCount = thread1.counter + thread2.counter;
            long end = System.currentTimeMillis();
            System.out.println("The sum from " + thread1.startRange + " to " + thread1.endRange + " is " + thread1.counter);
        }

        static public void oneThread(){
            long start = System.currentTimeMillis();
            SumUpExample thread = new SumUpExample(1, MAX_NUM);
            thread.add();
            long end = System.currentTimeMillis();
            System.out.println("The sum from " + thread.startRange + " to " + thread.endRange + " is " + thread.counter);
            System.out.println("Time taken: " + (end - start) + " milliseconds");
        }
}