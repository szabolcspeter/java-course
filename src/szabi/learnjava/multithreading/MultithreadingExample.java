package szabi.learnjava.multithreading;

class Worker implements Runnable {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Worker with id " + id + " is running: " + i);
        }
    }
}

public class MultithreadingExample {

    public static void main(String[] args) {

        Thread worker1 = new Thread(new Worker(1));
        Thread worker2 = new Thread(new Worker(2));

        worker1.start();
        worker2.start();

        try {
            // main thread is blocked until worker threads finish execution
            // VIRTUAL THREADS IT IS NO LONGER A PROBLEM!!
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // wait with the main thread
        System.out.println("Main thread finishes...");
    }
}
