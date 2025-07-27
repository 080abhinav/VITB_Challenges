package TeachersDay2025;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static List<String> fizzBuzz(int n) {
        String arr[] = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<String> arr = fizzBuzz(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        scn.close();
    }
}
