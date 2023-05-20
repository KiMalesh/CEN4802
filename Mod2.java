package modules;

import java.util.*;

public class Mod2
{
        public static int fibonacci(int n)
    {
    if (n <= 1)
       return n;
    return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main (String args[])
    {
    int n;
    Scanner scanner=new Scanner(System.in);
    System.out.println(" N = ");
    n=scanner.nextInt();
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
