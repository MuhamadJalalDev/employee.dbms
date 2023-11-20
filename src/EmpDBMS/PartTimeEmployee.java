
package EmpDBMS;
import java.util.Scanner;
public class PartTimeEmployee extends employee{
    private double salaryRate;

    PartTimeEmployee(String name, int age) {
        super(name, age);
    }
    
    public void setSalaryRate(double workinghour){
        this.salaryRate=workinghour;
    }
    
    public double getSalaryRate(){
        return salaryRate;
    }
    public void input1(){
        super.input();
        System.out.println("enter working hours: ");
        Scanner scan=new Scanner(System.in);
        salaryRate=scan.nextDouble();
    
    }
    public void display1(){
        super.display();
        System.out.println("your salary rate is: "+ salaryRate*8);
    }
}