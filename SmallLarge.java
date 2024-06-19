import java.util.Scanner;

// Write a program to find position of the smallest number & the largest number from given n numbers.
public class SmallLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array  size as you want :");
        int size = sc.nextInt();
        int[] array = new int[size];
        int max = 0;
        int min = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("enter array element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println("Smallest number is  " + array[(min)]);
        System.out.println("Largest number is  " + array[(max)]);
    }
}
