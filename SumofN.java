import java.util.Scanner;
public class SumofN 
{
    public static void main(String args[])
    {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to which you want to calculate sum : = ");
        n = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of numbers from 1 to "+n+ " is "+sum);
    }    
}
