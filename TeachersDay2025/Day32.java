package TeachersDay2025;
import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int count=0;
        while(n>0){
            long a=n%10;
            if(a==4 || a==7){
                count++;
            }
            n=n/10;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        scn.close();
    }
}
