package multithreading;
public  class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Cheen Tapak Dam Dam");
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}
