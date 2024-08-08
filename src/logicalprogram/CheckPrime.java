package logicalprogram;
public class CheckPrime {
    public static boolean isPrime(long value)
    {
        boolean response = false;
        int counter = 0;
        int val = 0;
        for(int i=2; i<=value; i++)
        {
            if(value%i==0)
            {
                counter++;
                val = i;
            }
        }
        if(counter==2)
        {
        response = true;
        }
        return  response;
    }
}
