package MultiThreadingDemo;

public class Thread2 extends Thread{
    public void run(){
        for (int i = 50; i >0 ; i--) {
            System.out.println("MyThread");
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
