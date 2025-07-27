package TeachersDay2025;

import java.util.Scanner;

public class Day1 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        findNumbers(arr);
        scn.close();
    }
}
