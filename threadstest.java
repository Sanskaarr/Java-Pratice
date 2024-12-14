public class threadstest extends Thread{
    public static void main(String[] args) {
        threadstest t1 = new threadstest();
        threadstest t2 = new threadstest(); 

        t1.start();
        t2.start();
        t1.isAlive();

    }

    public void run() {
        System.out.println("Thread Started");
        System.out.println(getName());
        System.out.println(getPriority());
        System.out.println(isAlive());
    }

}
