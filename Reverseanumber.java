import java.util.Scanner;
public class Reverseanumber 
{
    public static void main(String args[])
    {
        int num;
        int rev=0;
        int n;
        int r =0;
        //n=num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: = ");
        num = sc.nextInt();

        for(n=num; n>0; n/=10)
        {
            r = n%10;
            rev = rev*10 + r;
        }
        System.out.println("The reverse of a number "+num+ " is "+rev);
    }    
}
