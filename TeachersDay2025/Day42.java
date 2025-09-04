package TeachersDay2025;
import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n=scn.nextLong();
        long sum=0;
        if(n%2==0){
            sum=n/2;
        }
        else{
            sum=-(n+1)/2;
        }
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         sum=sum+i;
        //     }
        //     else{
        //         sum=sum-i;
        //     }
        // }
        System.out.println(sum);
        scn.close();
    }
}
