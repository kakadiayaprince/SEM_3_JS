// Write a program to read and display n numbers using an array.
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter array element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}