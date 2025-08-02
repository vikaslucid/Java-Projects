import java.util.Scanner;
public class GradeCalculator 
{
    public static void main(String args[])
    {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        marks = sc.nextInt();
        
        if(marks>=90)
        
        System.out.println("You have achieved Grade A");
        
        else if(marks>=80 && marks <90)
        System.out.println("You have achieved Grade B");

        else if(marks>=70 && marks <80)
        System.out.println("You have achieved Grade C");

        else if(marks>=60 && marks <70)
        System.out.println("You have achieved Grade D");

        else if(marks <60)
        System.out.println("Sorry , You are not eligible");
    }    
}
