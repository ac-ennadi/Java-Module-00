import java.util.Scanner;

public class Program {
    static int sum = 1;
    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        else if (n >= 2)
        {
            int i = 2;
            while(i * i <= n)
            {
                if ((n % i) == 0)
                {
                    return false;
                }
                sum++;
                i++;
            }
        }
        return true;
    }

    public  static void main(String[] arg)
    {
        Scanner obj = new Scanner(System.in);
        int input = obj.nextInt();
        System.out.println(isPrime(input) + " " + sum);
    }
}