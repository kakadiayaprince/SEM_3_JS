//Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m:");
        int m = sc.nextInt();
        System.out.print("enter n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {

            sum += i;
        }
        System.out.println("your sum is :" + sum);
    }
}
