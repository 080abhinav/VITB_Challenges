package TeachersDay2025;
import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        scn.close();
        while(true){
            int count=0;
            n++;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==1){
                break;
            }
        }
        if(m==n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
