import java.util.Scanner;

public class SimpleATMInterface {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int balance = 10000;
        int choice=-1;
        boolean exit = false;

        System.out.println("Welcome to LUCID POINT ATM");
        while(!exit)
        {
            System.out.println("Press 1 to check your balance");
            System.out.println("Press 2 for deposit");
            System.out.println("Press 3 for Withdraw");
            System.out.println("Press 4 for Exit");

            System.out.println("Choose an Option");
            choice = sc.nextInt();


            switch(choice)
            {
                case 1 : 
                        System.out.println("Your current balance is  Rs"+balance);
                        break;
                
                case 2: 
                        System.out.println("Enter the amount to deposit");
                        int deposit = sc.nextInt();
                        
                        if(deposit>0)
                        {
                            balance = balance + deposit;
                            System.out.println("Deposit Successful");
                        }
                        else
                            System.out.println("Invalid Amount");
                        break;
                case 3: 
                        System.out.println("Enter the withdrawl amount");
                        int withdraw = sc.nextInt();
                        
                        if(withdraw>0 && withdraw<=balance)
                        {
                            balance = balance-withdraw;
                            System.out.println("Withdrwal Successful");
                        }
                        else
                            System.out.println("Invalid amount");
                        break;
                case 4: 
                        exit = true;
                        System.out.println("Thank you for using LP ATM");
                        break;
                default: 
                        System.out.println("Option Invalid");

                                        

            }
        }
        sc.close();
    }
}
