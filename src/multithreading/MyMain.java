package multithreading;

public class MyMain extends Thread{
    @Override
    public  void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread threadMyMain = new MyMain();
        System.out.println("threadMyMain = " + threadMyMain);
        System.out.println("threadMyMain = " + threadMyMain);
        threadMyMain.start();
        MyRunnable multiThreading = new MyRunnable();
        Thread ThreadMultiThreading = new Thread(multiThreading);
        ThreadMultiThreading.start();
    }
}
