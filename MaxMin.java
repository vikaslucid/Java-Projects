import java.util.Scanner;
public class MaxMin
{
    public static void main(String args[])
    {
        int myarray[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num;
        int max = 0;
        //int min = 0;

        System.out.println("How many elements do you want in the array : = ");
        num = sc.nextInt();

        for(int i=0; i<num; i++)
        {
            System.out.println("Enter the"+(i+1)+ "element in the myarray : ");
            myarray[i] = sc.nextInt();
        }
        System.out.println("The elements in the myarray are : =");
        for(int j=0; j<num; j++)
        {
            System.out.println(myarray[j]);
        }
        for(int k=0; k<num; k++)
        {
            if(max < myarray[k])
                max = myarray[k];
        }
        System.out.println("The maximum element in the myarray is : = "+max);
    }
}
