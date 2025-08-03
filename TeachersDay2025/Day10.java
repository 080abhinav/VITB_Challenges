package TeachersDay2025;
import java.util.Scanner;
public class Day10 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]>=arr[k-1]){
                count++;
            }
        }
        scn.close();
        System.out.println(count);
    }
}
