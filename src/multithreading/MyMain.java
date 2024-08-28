package multithreading;

public class MyMain extends Thread{
    @Override
    public  void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getState());
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread runnable = new Thread(myRunnable);

        System.out.println("thread.getState() = " + thread.getState());
        System.out.println("runnable.getState() = " + runnable.getState());
        runnable.start();
        thread.start();
        thread.setPriority(MIN_PRIORITY);
        runnable.setPriority(MAX_PRIORITY);
    }
}
