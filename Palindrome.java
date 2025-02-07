import java.util.Scanner;

public class Palindrome {

    // Đếm số từ trong chuỗi
    public static int DoDaiChuoi(String str) {
        return str.split("\\s+").length;
    }

    // Đếm tổng số ký tự trong chuỗi (bao gồm khoảng trắng)
    public static int DemTu(String str) {
        return str.replaceAll("\\s+", "").length();
    }

    // Nối hai chuỗi lại với nhau
    public static String NoiChuoi(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Kiểm tra chuỗi có phải Palindrome không
    public static void KiemTraChuoiDoiXung(String str) {
        String s1 = str.replaceAll("\\s+", "").toLowerCase();
        String s2 = new StringBuilder(cleanedStr).reverse().toString();

        if (s1.equals(s2)) {
            System.out.println("Đây là chuổi đối xứng");
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
