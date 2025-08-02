import java.util.Scanner;
public class EvenOdd 
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter the number to be checked even or odd : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a%2==0)
        System.out.println("The number is even");
        
        else
        System.out.println("The number is odd");
        sc.close();
    }    
}
