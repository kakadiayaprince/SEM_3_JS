import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int flag;

        for (int i = 1; i <= 1000; i++) {
            flag = i % 10;
            sum = sum + (flag * flag * flag);
            i = (i / 10);

        }
        if (temp == sum) {
            System.out.println(i + ",");
        } else {
            //
        }
    }
}
