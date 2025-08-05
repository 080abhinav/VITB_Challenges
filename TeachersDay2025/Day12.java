package TeachersDay2025;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        int x=0;
        a =a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                System.out.println(1);
                break;
            }
            else if(a.charAt(i)<b.charAt(i)){
                System.out.println(-1);
                break;
            }
            x++;
        }
        if(x==a.length()){
            System.out.println(0);
        }
        scn.close();
    }
}
