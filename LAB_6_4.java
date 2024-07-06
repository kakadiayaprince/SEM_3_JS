
// package  DS_PROGRAMES;
import java.util.Scanner;

public class LAB_6_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fahrenheitcelsiuscalculator fcc = new Fahrenheitcelsiuscalculator();
        System.out.println(" enetr what you want to convert celsius to fahrenheit  than enter 1 otherwise 0 for fahrenheit to celsius :");
        int temp = sc.nextInt();
        if (temp == 1) {
            fcc.fahrenheitcalculation();
        } else if (temp == 0) {
            fcc.celsiuscalculation();
        } else {
            System.out.println("enter the correct value");
        }
    }
}

class Fahrenheitcelsiuscalculator {

    double fahrenheit;
    double celsius;

    public void celsiuscalculation() {
        Scanner sc = new Scanner(System.in);
        Fahrenheitcelsiuscalculator fcc = new Fahrenheitcelsiuscalculator();
        System.out.println("enter fahrenheit");
        fahrenheit = sc.nextDouble();
        celsius = ((fahrenheit - 32) * (5)) / 9;
        System.out.println(" your celsius is :" + celsius);
    }

    public void fahrenheitcalculation() {
        Scanner sc = new Scanner(System.in);
        Fahrenheitcelsiuscalculator fcc = new Fahrenheitcelsiuscalculator();
        System.out.println("enter celsius");
        celsius = sc.nextDouble();
        fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println(" your fahrenheit is :" + fahrenheit);
    }
}
