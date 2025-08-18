package TeachersDay2025;
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        int l=0;
        int u=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                u++;
            }
            else{
                l++;
            }
        }
        if(u>l){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }
    }
}
