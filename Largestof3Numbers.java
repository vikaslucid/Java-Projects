import java.util.Scanner;
public class Largestof3Numbers 
{
    public static void main(String args[])
    {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        a = sc.nextInt();

        System.out.println("Enter the second number : ");
        b = sc.nextInt();

        System.out.println("Enter the third number : ");
        c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            System.out.println("First number = " +a+ " is greatest");
            else
            System.out.println("Third number = " +c+ " is greatest");
        }
        else
        {
            if(b>c)
            System.out.println("Second number = " +b+ " is greatest");
            else
            System.out.println("Third number = " +c+ " is greatest");
        }
        sc.close();
        

    }
}
