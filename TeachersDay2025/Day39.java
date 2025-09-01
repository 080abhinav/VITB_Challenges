package TeachersDay2025;
import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            arr[i]=scn.nextInt();
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        int count= 0;
        int maxidx= -1;
        for (int i=0; i<n; i++) {
            if (arr[i]==max) {
                maxidx=i;
                break;
            }
        }
        while(maxidx>0) {
            int temp=arr[maxidx];
            arr[maxidx]=arr[maxidx-1];
            arr[maxidx-1]= temp;
            count++;
            maxidx--;
        }
        int minidx= -1;
        for (int i=n-1;i>=0; i--) {
            if (arr[i]==min) {
                minidx=i;
                break;
            }
        }
        while (minidx<n-1) {
            int temp= arr[minidx];
            arr[minidx]= arr[minidx+1];
            arr[minidx+1]= temp;
            count++;
            minidx++;
        }
        System.out.println(count);
        scn.close();
    }
}