import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array  size as you want :");
        int size = sc.nextInt();
        int[] array = new int[size];
        boolean Duplicate = false;
        int DuplicateNumber = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("enter array element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    Duplicate = true;
                    DuplicateNumber = array[i];
                    break;
                }
            }
        }
        if (Duplicate == true) {
            System.out.println("Duplicate element " + DuplicateNumber + " found in array");
        } else {
            System.out.println("No duplicate element found in array");
        }
    }
}
