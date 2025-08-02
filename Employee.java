public class Employee 
{
    String name;
    int empId;
    double salary;
    
    void displaydetails()
    {
        System.out.println("Name of Employee : "+name);
        System.out.println("empId            : "+empId);
        System.out.println("Salary           : "+name);
        
        
    }
}

class Manager extends Employee
{
    String department;

    void displaydetails()
    {
        System.out.println("Department of Employee : "+department);
        super();
        
    }
}
class EmployeeInheritance
{
    public static void main(String args[])
    {
        Manager me = new Manager();
        //Employee emp = new Employee();
        Scanner sc = new Scanner();
        System.out.println("Enter employee name");
        me.name = sc.nextLine();
        System.out.println("Enter emplyee id");
        me.empId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Salary");
        me.salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter department name");
        me.department =sc.nextLine();
        me.displaydetails();
        
        

        
    }
}
