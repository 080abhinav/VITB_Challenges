package TeachersDay2025;
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                count++;
            }
            else if(min>arr[i]){
                min=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
