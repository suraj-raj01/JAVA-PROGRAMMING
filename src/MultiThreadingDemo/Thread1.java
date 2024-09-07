package MultiThreadingDemo;

public class Thread1 implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=50; i++){
            System.out.println("MyRunnable");
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
