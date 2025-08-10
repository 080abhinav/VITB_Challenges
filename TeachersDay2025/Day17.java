package TeachersDay2025;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String str = scn.nextLine();
        scn.close();
        int count=0;
        for (int i = 1; i < str.length();i++ ) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
