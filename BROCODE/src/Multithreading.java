public class Multithreading {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        MyRunnableMulti myRunnable = new MyRunnableMulti("PING");
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(new MyRunnableMulti("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME END!");

    }
}
