package TeachersDay2025;
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int dup[]=new int[n];
        for(int i=0;i<n;i++){
            dup[arr[i]-1]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.println(dup[i]);
        }
        scn.close();
    }
}
