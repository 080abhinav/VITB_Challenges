package TeachersDay2025;
import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k=scn.nextInt();
        int w=scn.nextInt();
        int n=scn.nextInt();
        int cost=(n*(n+1)/2)*k;
        if(cost>w){
            System.out.println(cost-w);
        } 
        else{
            System.out.println(0);
        }
        scn.close();
    }
}
