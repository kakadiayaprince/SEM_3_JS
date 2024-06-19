import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array  size as you want :");
        int size = sc.nextInt();
        int[] array = new int[size];
        int duplicate = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("enter array element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if (array[i] == array[duplicate]) {
                duplicate = i;
            }
        }
        System.out.println("duplicate number is  " + array[(duplicate)]);

    }
}
