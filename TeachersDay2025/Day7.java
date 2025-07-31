package TeachersDay2025;
import java.util.Scanner;
public class Day7 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<=2){
            System.out.println("NO");
        }
        else{
            if((n-2)%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        scn.close();
    }
}
