package TeachersDay2025;
import java.util.Scanner;
public class Day9 {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        for(int i=0; i<n; i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if(a+b+c>1){
                count++;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
