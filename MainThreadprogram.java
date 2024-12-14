import java.util.Random;

// Shared object for synchronization
class SyncObject {
    public int number;
    public boolean isEven = false;
    public boolean isReady = false;

    public synchronized void waitForReady() throws InterruptedException {
        while (!isReady) {
            wait();
        }
        isReady = false; // Reset for next iteration
    }

    public synchronized void notifyReady() {
        isReady = true;
        notifyAll(); // Notify waiting threads
    }
}

// Thread to generate random numbers
class GeneratorThread extends Thread {
    private SyncObject syncObject;
    private Random random;

    public GeneratorThread(SyncObject syncObject) {
        this.syncObject = syncObject;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) { // Run indefinitely
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            int number = random.nextInt(100); // Generate a random number between 0 and 99
            syncObject.number = number;
            syncObject.isEven = (number % 2 == 0); // Check if the number is even

            System.out.println("Generated Number: " + number);

            syncObject.notifyReady(); // Notify that a new number is ready
            try {
                syncObject.waitForReady(); // Wait for processing to finish
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Thread to compute square of even numbers
class SquareThread extends Thread {
    private SyncObject syncObject;

    public SquareThread(SyncObject syncObject) {
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        while (true) { // Run indefinitely
            try {
                syncObject.waitForReady(); // Wait for a new number to be generated
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (syncObject.isEven) {
                int square = syncObject.number * syncObject.number;
                System.out.println("Square of " + syncObject.number + ": " + square);
            }

            syncObject.notifyReady(); // Signal processing is done
        }
    }
}

// Thread to compute cube of odd numbers
class CubeThread extends Thread {
    private SyncObject syncObject;

    public CubeThread(SyncObject syncObject) {
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        while (true) { // Run indefinitely
            try {
                syncObject.waitForReady(); // Wait for a new number to be generated
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (!syncObject.isEven) {
                int cube = syncObject.number * syncObject.number * syncObject.number;
                System.out.println("Cube of " + syncObject.number + ": " + cube);
            }

            syncObject.notifyReady(); // Signal processing is done
        }
    }
}

public class MainThreadprogram {
    public static void main(String[] args) {
        SyncObject syncObject = new SyncObject();

        GeneratorThread generatorThread = new GeneratorThread(syncObject);
        SquareThread squareThread = new SquareThread(syncObject);
        CubeThread cubeThread = new CubeThread(syncObject);

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }
}
