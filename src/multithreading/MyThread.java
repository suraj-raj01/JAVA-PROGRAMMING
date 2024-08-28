package multithreading;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
                System.out.println("My Thread");
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
