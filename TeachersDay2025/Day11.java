package TeachersDay2025;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        s=s.toLowerCase();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'){
                continue;
            }
            else {
                ans=ans+"."+s.charAt(i);
            }
        }
        System.out.println(ans);
        scn.close();
    }
}
