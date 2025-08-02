import java.util.Scanner;
public class AreaCalculator 
{
    public static void main(String args[])
    {
        double length;
        double breadth;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        length = sc.nextDouble();
        System.out.print("Enter the value of breadth : ");
        breadth = sc.nextDouble();
        area = length*breadth;
        System.out.print("The area of rectangle is : "+area);




    }    
}
