import java.util.Scanner;
abstract class Payment 
{
    protected double amount;
    static int transactionCount;
    
    abstract void processPayment();
    
     void printReceipt()
    {
        System.out.println("This is transaction number: "+transactionCount);
    }

}

class CreditCardPayment extends Payment
{
   // protected double amount;
    double processingFee = 0.02;
    @Override
    void processPayment()
    {
        System.out.println("Original Amount     :   "+amount);
        System.out.println("Processing Fee(2%)  :   "+amount*processingFee);
        System.out.println("Final Charged       :   "+(amount+amount*processingFee));
        System.out.println("Transaction of Rs. "+amount+" completed");
        transactionCount++;
        printReceipt();
        
    }
}

class DebitCardPayment extends Payment
{
   // protected double amount;
    double processingFee = 0.015;
    @Override
    void processPayment()
    {
        System.out.println("Original Amount         :   "+amount);
        System.out.println("Processing Fee(1.5%)    :   "+amount*processingFee);
        System.out.println("Final Charged           :   "+(amount+amount*processingFee));
        System.out.println("Transaction of Rs. "+amount+" completed");
        transactionCount++;
        printReceipt();
    }
}

class UPIPayment extends Payment
{
   // protected double amount;
    double processingFee = 0.005;
    @Override
    void processPayment()
    {
        System.out.println("Original Amount         :   "+amount);
        System.out.println("Processing Fee(0.5%)    :   "+amount*processingFee);
        System.out.println("Final Charged           :   "+(amount+amount*processingFee));
        System.out.println("Transaction of Rs. "+amount+" completed");
        transactionCount++;
        printReceipt();
    }
}

class PaymentGateway
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        double amount;
        String method;
        Payment p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        amount =sc.nextDouble();
        while(amount <100)
        {
            System.out.println("The amount must be greater or equal to hundred");
            amount =sc.nextDouble();
        }
        sc.nextLine();
        System.out.println("Select Payment method (credit /debit /upi): ");
        method =sc.next();
        sc.nextLine();
        if(method.equalsIgnoreCase("credit"))
        {
            p = new CreditCardPayment();
            p.amount = amount;
            p.processPayment();
        }
        else if(method.equalsIgnoreCase("debit"))
        {
            p = new DebitCardPayment();
            p.amount = amount;
            p.processPayment();
        }
        else if(method.equalsIgnoreCase("upi"))
        {
            p = new UPIPayment();
            p.amount = amount;
            p.processPayment();
        }
        else
        {
            System.out.println("Unsupported Payment method");
        }
        sc.close();
    }
}