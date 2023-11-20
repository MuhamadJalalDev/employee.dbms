
package EmpDBMS;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1 for FullTimeEmployee or 2 for PartTimeEmployee:");
        int userType = scan.nextInt();
        
        if (userType == 1) {
            FullTimeEmployee e2 = new FullTimeEmployee("name", 0);
            e2.input2();
            e2.display2();
        } else if (userType == 2) {
            PartTimeEmployee e1 = new PartTimeEmployee("name", 0);
            e1.input1();
            e1.display1();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
