package modules;
// Stating the imports needed to help run the code
import java.util.*;

public class Mod2
{
    //method to return the nth term of fibonacci sequence
    public static int fibonacci(int n)
    {
    //if n is 1 or less then return n
    if (n <= 1)
            // Return what we typed for n
       return n;
    //recursively call the function
    return fibonacci(n-1) + fibonacci(n-2);
    }
    //main() method started here
    public static void main (String args[])
    {
    //start n as a int and create n function
    int n;
    //create Scanner class
    Scanner scanner=new Scanner(System.in);
    //get value of n for the sequence along with chosing a value for n
    System.out.println(" N = ");
    n=scanner.nextInt();
    //print nth number in sequence along with the statement needed
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
