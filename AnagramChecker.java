import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String second = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("\n===== ANAGRAM CHECKER =====");

        if (Arrays.equals(a, b)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
