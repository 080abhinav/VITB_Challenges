package TeachersDay2025;
import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int p=scn.nextInt();
            int q=scn.nextInt();
            if(q-p>=2){
                count++;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
