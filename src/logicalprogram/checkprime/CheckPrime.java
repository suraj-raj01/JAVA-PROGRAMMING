package logicalprogram.checkprime;
public class CheckPrime {
    public static boolean isPrime(long value)
    {
        boolean response = true;
        int counter = 0;
        for(int i=2; i<value; i++)
        {
            if (value % i == 0) {
                counter = 1;
                break;
            }
        }
        if(counter==1)
        {
        response = false;
        }
        return  response;
    }
}
