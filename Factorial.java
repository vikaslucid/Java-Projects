import java.util.Scanner;
public class Factorial 
{
    public static void main(String args[])
    {
        int n;
        int fact = 1;
        System.out.println("Enter the number whose factorial you want to calculate");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            fact = fact *i;
        }
        System.out.println("The factorial of "+n+ " is "+fact);
    }    
}
