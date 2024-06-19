
//Write a program to delete a number from a given location in an array.
import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter array element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the position where you want to delete the number: ");
        int index = sc.nextInt();

        int newarray[] = new int[size - 1];
        for (int i = 0; i < index - 1; i++) {
            newarray[i] = array[i];
        }
        for (int i = index; i < size - 1; i++) {
            newarray[i] = array[i + 1];
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.println("new array after insering:" + newarray[i]);
        }

    }

}
