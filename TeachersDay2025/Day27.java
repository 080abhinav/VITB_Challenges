package TeachersDay2025;
import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum=0;
        for(int i=0;i<n;i++){
            int x=scn.nextInt();
            sum=sum+x;
        }
        System.out.println(sum/n);
        scn.close();
    }
}
