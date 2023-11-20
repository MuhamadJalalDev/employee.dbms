
package EmpDBMS;

import java.util.Scanner;
public class employee  {
    private String name;
    private int age;
    employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setEmployee_info(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name");
        name= scan.nextLine();
        System.out.println("enter age");
        age= scan.nextInt();
        
    }
    public void display(){
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
    }
}
