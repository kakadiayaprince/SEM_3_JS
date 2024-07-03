import java.util.Scanner;

public class LAB_6_4 {
    public static void main(String[] args) {

    }
}

class Fahrenheit {
    double fahrenheit;
    double celsius;

    public void celsiuscalculation() {
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextDouble();
        fahrenheit = ((celsius - 32) * (5)) / 9;
    }
    public void fahrenheitcalculation() {
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();
        celsius = ((celsius - 32) * (5)) / 9;
    }
}
