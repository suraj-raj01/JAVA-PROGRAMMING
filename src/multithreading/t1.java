package multithreading;

public class t1 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
