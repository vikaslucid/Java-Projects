import java.util.Scanner;

public class DemoProject1 
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int myrandom = (int)(Math.random()*100);
            int userNumber=0;
            do
            {
                System.out.println("Guess the number");
                userNumber = sc.nextInt();
                if(userNumber<myrandom)
                {
                    System.out.println("Number is too small");
                }
                else if (userNumber> myrandom)
                {    System.out.println("Number is too large");
                }
                    else if(userNumber ==myrandom)
                    {
                        System.out.println("Wohooo.. You guessed it right");
                        break;
                    }
            }while(userNumber>=0);
            System.out.println("My number was =   "+myrandom);
    }
}
