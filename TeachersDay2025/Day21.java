package TeachersDay2025;
import java.util.Arrays;
import java.util.Scanner;
public class Day21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            sum = sum+arr[i];
        }
        Arrays.sort(arr);
        int temp=0;
        int count=0;
        for(int i=n-1;i>=0;i--){
            temp = temp+arr[i];
            count=count+1;
            if(temp>(sum/2)){
                break;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
