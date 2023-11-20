

package EmpDBMS;
import java.util.Scanner;

public class FullTimeEmployee extends employee {
    private double yearlySalary;

    public FullTimeEmployee(String name, int age) {
        super(name, age);
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double mounthlysalary) {
        this.yearlySalary = mounthlysalary;
    }
    public void input2(){
        super.input();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter salary");
        yearlySalary = scan.nextDouble();
    }
    public void display2(){
        super.display();
        System.out.println("your salary is"+yearlySalary*12);
    }
    
    
}
