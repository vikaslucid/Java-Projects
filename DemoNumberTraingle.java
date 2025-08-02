import java.util.Scanner;
class DemoNumberTraingle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        int i,j;
        System.out.println("Enter the number of rows of traingle");
        int row = sc.nextInt();
        for(i=row; i>=1;i--)
        {
            
            for(j=1;j<=i;j++)
            {
                System.out.print(""+j);
                if(i==j)   
                System.out.print(" ");    
            }
            System.out.println();
            
        }
    }
}