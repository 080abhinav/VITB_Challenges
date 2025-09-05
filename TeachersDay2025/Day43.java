package TeachersDay2025;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "";
        if (s.length() == 1) {
            if (Character.isUpperCase(s.charAt(0))) {
                ans = s.toLowerCase();
            } else {
                ans = s.toUpperCase();
            }
        } else {
            int check = 1;
            int ch = 0;
            if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
                ch = 1;
            }
            for (int i = 1; i < s.length(); i++) {
                if (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    check = 0;
                    break;
                }
            }
            if (check == 1 && ch == 1) {
                ans = s.toLowerCase();
            } else if (check == 1 && ch == 0) {
                s = s.toLowerCase();
                for (int i = 0; i < s.length(); i++) {
                    if (i == 0) {
                        ans = ans + (char) (s.charAt(i) - 32);
                    } else {
                        ans = ans + s.charAt(i);
                    }
                }
            } else {
                ans = s;
            }
        }
        System.out.println(ans);
        scn.close();
    }
}