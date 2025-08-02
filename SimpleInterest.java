import java.util.Scanner;
public class SimpleInterest 
{
    public static void main(String args[])
    {
        double p;
        double r;
        double t;
        double si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter the rate");
        r = sc.nextDouble();
        System.out.println("Enter the time");
        t = sc.nextDouble();
        si = (p*r*t)/100;
        System.out.println("The Simple Interest is "+si);

    }
}
