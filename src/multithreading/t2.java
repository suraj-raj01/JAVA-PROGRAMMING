package multithreading;
public class t2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(i);
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
