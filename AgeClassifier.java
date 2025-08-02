import java.util.Scanner;
public class AgeClassifier 
{
    public static void main(String args[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        
        age = sc.nextInt();
        
        if (age< 13)
        System.out.println("You are a child");
        
        else if(age>=13 && age<=19)
        System.out.println("You are a teenager");
        
        else if(age>19 && age<=60)
        System.out.println("You are an adult");

        else if(age>60)
        System.out.println("You are a Senior citizen");

        sc.close();


        

    }    
}
