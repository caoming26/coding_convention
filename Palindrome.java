import java.util.Scanner;

public class Palindrome {

        // Count the number of words in a string
    public static int countWords(String str) {
        return str.split("\\s+").length;
    }

    // Count the total number of characters in a string (excluding spaces)
    public static int countCharacters(String str) {
        return str.replaceAll("\\s+", "").length();
    }

    // Concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Check if a string is a Palindrome
    public static void checkPalindrome(String str) {
        String s1 = str.replaceAll("\\s+", "").toLowerCase();
        String s2 = new StringBuilder(s1).reverse().toString(); // Fixed variable name

        if (s1.equals(s2)) {
            System.out.println("This is a Palindrome string");
        } else {
            System.out.println("This string is not a Palindrome");
        }
    }


    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = SC.nextLine().trim();

        System.out.println("The number of words in the string is: " + DoDaiChuoi(str));
        System.out.println("The number of characters in the string (excluding spaces) is: " + DemTu(str));
        KiemTraChuoiDoiXung(str);

        System.out.println("Enter your first string to concatenate: ");
        String str1 = SC.nextLine().trim();
        System.out.println("Enter your second string to concatenate: ");
        String str2 = SC.nextLine().trim();
        System.out.println("The concatenated string is: " + NoiChuoi(str1, str2));

        SC.close();
    }
}
