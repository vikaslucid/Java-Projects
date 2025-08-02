import java.util.Scanner;
public class BasicArrayUsage
{
    public static void main(String args[])
    {
        int myarray[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num;
        int sum =0;
        double average=0;
        System.out.println("How many elements you want to enter in the array : = ");
        num = sc.nextInt();
        for(int i=0; i<num; i++)
        {
            System.out.print("Enter the "+(i+1)+" number : = ");
            myarray[i] = sc.nextInt();
        }
        System.out.println("The elements in the myarray are ");
        for(int j=0; j<num; j++)
        {
           System.out.println(myarray[j]); 
           sum = sum +myarray[j];
        }
        average = (double)sum/num;
        System.out.println("The sum of the elements of the myarray is " +sum);
        System.out.println("The average of the elements of the myarray is " +average);
    }
}
