package TeachersDay2025;
import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int count= 1;
            int j= i-1;
            while (j>=0 && arr[j]<=arr[j+1]) {
                count++;
                j--;
            }
            j=i+1;
            while (j<n && arr[j]<=arr[j-1]) {
                count++;
                j++;
            }
            if (count >max) {
                max= count;
            }
        }
        System.out.println(max);
        scn.close();
    }
    
}
