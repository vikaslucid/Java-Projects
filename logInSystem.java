import java.util.Scanner;
public class logInSystem 
{
    public static void main(String args[])
    {
            String username ="admin";
            String password ="1234";
            int count=3;
            Scanner sc = new Scanner(System.in);
            do 
            {
                System.out.println("Enter username :  ");
                String user = sc.next();
                System.out.println("Enter the password =   ");
                String pass = sc.next();
                if(username.equals(user)&& password.equals(pass))
                {
                    System.out.println("Login successful");
                    break;
                }
                else
                {
                    count--;
                    System.out.println("You have "+count+ "attempts left");
                }

            } while(count!=0);
    }    
}
