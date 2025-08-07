package TeachersDay2025;
import java.util.Scanner;
public class Day14 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        String ans ="";
        if(s.charAt(0)>=97 && s.charAt(0)<=122){
            ans=ans+(char)(s.charAt(0)-32);
        }
        else{
            ans=ans+s.charAt(0);
        }
        for(int i=1;i<s.length();i++){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
