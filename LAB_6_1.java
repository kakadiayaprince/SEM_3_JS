
// Write a program to swap two numbers using user-defines method.
import java.util.Scanner;

public class LAB_6_1 {
    public static void main(String[] args) {
        Swap sw = new Swap();
        sw.swaping();
        System.out.println("after Swaping :" + " a is :" + sw.a + " and " + " b is :" + sw.b);

    }
}

class Swap {
    int a;
    int b;

    public void swaping() {
        Scanner sc = new Scanner(System.in);
        Swap sw = new Swap();
        System.out.println("Enter the a: ");
        a = sc.nextInt();
        System.out.println("Enter the b: ");
        b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
    }
}