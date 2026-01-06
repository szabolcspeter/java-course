package szabi.learnjava.multithreading;

class WorkerApproach1 implements Runnable {
    private int id;

    public WorkerApproach1(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            System.out.println("Worker with id " + id + " is running: " + i);
    }
}

class WorkerApproach2 extends Thread {
    private int id;

    public WorkerApproach2(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            System.out.println("Worker with id " + id + " is running: " + i);
    }
}

public class CreateThreads {

    public static void main(String[] args) {
        Thread worker1 = new Thread(new WorkerApproach1(1));
        Thread worker2 = new Thread(new WorkerApproach1(2));

        worker1.start();
        worker2.start();

//        WorkerApproach2 worker3 = new WorkerApproach2(1);
//        WorkerApproach2 worker4 = new WorkerApproach2(2);
//
//        worker3.start();
//        worker4.start();
    }
}
