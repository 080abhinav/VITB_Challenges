package TeachersDay2025;
import java.util.Scanner;
public class Day18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            if(s.equals("++X") || s.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
        scn.close();
    }
}
