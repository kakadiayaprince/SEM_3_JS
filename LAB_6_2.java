
import java.util.Scanner;

// Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. Write a program to read the detail from user and print it.
public class LAB_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_Detail e1 = new Employee_Detail();

        e1.GetDetail();
        e1.PrintDetail();

    }
}

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    public void GetDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee_ID: ");
        Employee_ID = sc.nextInt();
        System.out.println("Enter Name: ");
        Name = sc.next();
        System.out.println("Enter Designation: ");
        Designation = sc.next();
        System.out.println("Enter Salary: ");
        Salary = sc.nextInt();
    }

    public void PrintDetail() {
        System.out.println("Employee_ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary : " + Salary);
    }
}
