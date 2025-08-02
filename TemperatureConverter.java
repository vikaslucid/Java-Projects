import java.util.Scanner;
public class TemperatureConverter 
{
    public static void main(String args[])
    {
        double c;
        double f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature as degree celcius");
        c = sc.nextDouble();
        f = c*9/5 +32;
        System.out.println("The temperature in degree fahrenheit is "+f);



    }    
}
