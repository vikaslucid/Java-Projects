import java.util.Scanner;
public class HelloUser 
{
    public static void main(String args[])
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        
                System.out.println("Enter your name : ");
                name = sc.nextLine();
                System.out.println("Enter your age : ");
                age = sc.nextInt();
        
        System.out.println("Hello "+name+",you are "+age+" years old.");

    }    
}
