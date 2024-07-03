import java.util.Scanner;

public class LAB_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Detail S1 = new Student_Detail();
        S1.GetDetail();
        S1.PrintDetail();
        Student_Detail S2 = new Student_Detail();
        S2.GetDetail();
        S2.PrintDetail();
        Student_Detail S3 = new Student_Detail();
        S3.GetDetail();
        S3.PrintDetail();
        Student_Detail S4 = new Student_Detail();
        S4.GetDetail();
        S4.PrintDetail();
        Student_Detail S5 = new Student_Detail();
        S5.GetDetail();
        S5.PrintDetail();

    }
}

class Student_Detail {
    int Enrollment_No;
    String Name;
    int Semester;
    double cpi;

    public void GetDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment_No: ");
        Enrollment_No = sc.nextInt();
        System.out.println("Enter Name: ");
        Name = sc.next();
        System.out.println("Enter Semester: ");
        Semester = sc.nextInt();
        System.out.println("Enter cpi: ");
        cpi = sc.nextDouble();
    }

    public void PrintDetail() {
        System.out.println("Enrollment_No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Semester);
        System.out.println("cpi : " + cpi);
    }
}
