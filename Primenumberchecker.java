import java.util.Scanner;
public class Primenumberchecker 
{
    public static void main(String args[])
    {
        int num;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, you want to check whether its prime or not : = ");
        num = sc.nextInt();
        
        for(i=2; i<num; i++)
        {
            if(num%i==0)
            break;
        }
        
        if(num ==i)
        System.out.println("The number "+num+ " is prime");
        else
        System.out.println("The number "+num+" is not prime.");
    }
}
