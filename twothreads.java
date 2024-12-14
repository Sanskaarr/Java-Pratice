class EvenNumberPrinter implements Runnable {
    private final int range;

    public EvenNumberPrinter(int range) {
        this.range = range;
    }

    @Override
    public void run() {
        for (int i = 0; i <= range; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumberPrinter implements Runnable {
    private final int range;

    public OddNumberPrinter(int range) {
        this.range = range;
    }

    @Override
    public void run() {
        for (int i = 1; i <= range; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class twothreads {
    public static void main(String[] args) {
        int range = 20;  // Define the range up to which you want to print

        Thread evenThread = new Thread(new EvenNumberPrinter(range));
        Thread oddThread = new Thread(new OddNumberPrinter(range));

        evenThread.start();
        oddThread.start();
    }
}

