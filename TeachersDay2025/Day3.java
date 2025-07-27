package TeachersDay2025;

import java.util.Scanner;

public class Day3 {
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                ans.append(Character.toLowerCase(c));
            }
        }
        String rev = new StringBuilder(ans).reverse().toString();
        return ans.toString().equals(rev);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(isPalindrome(s));
        scn.close();
    }
}
