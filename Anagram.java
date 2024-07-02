import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  how many number of words you want to enter:");
        int n = sc.nextInt();
        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the word" + (i + 1) + ":");
            words[i] = sc.next();
        }
        double randomnum = Math.random() * n;
        int random = (int) randomnum;

        System.out.println("enter a word you enat check  either it is angram or not :");
        String word2 = sc.next();

        System.out.println(words[random]);

        if()
    }
}
