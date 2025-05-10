/*Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():
If experience > 5 years, bonus = 20% of salary Otherwise, bonus = 10% of salary Display the bonus amount for each employee.*/


import java.util.Scanner;
class Employee {
    String name;
    float salary;
    float experience;

    Employee(String name,float salary,float experience){
        this.name=name;
        this.salary=salary;
        this.experience=experience;
    }

    void calculateBonus(){
        float bonus=0;
        if(experience>5){
            bonus+=0.20f * salary;
        }
        else{
            bonus+=0.10f * salary;
        }
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Experience: "+experience);
        System.out.println("Bonus: "+bonus);

    }
}
public class Qn6_medium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Enter your salary: ");
        float salary=sc.nextFloat();
        System.out.println("Enter your Experience: ");
        float experience=sc.nextFloat();
        Employee emp=new Employee(name,salary,experience);
        emp.calculateBonus();
    }
}