package random_generator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println("random.nextInt() = "+random.nextInt());
//        generate 1000 random numbers
        int upperBound = 1000;
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(upperBound));
        }
    }
}
