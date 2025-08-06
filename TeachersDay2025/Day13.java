package TeachersDay2025;
import java.util.Scanner;
public class Day13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        String dum="";
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                a++;
            } 
            else if (s.charAt(i) == '2') {
                b++;
            } 
            else if (s.charAt(i) == '3') {
                c++;
            }
        }
        for (int i = 0; i < a; i++) {
            dum=dum+"1+";
        }
        for (int i = 0; i < b; i++) {
            dum=dum+"2+";
        }
        for (int i = 0; i < c; i++) {
            dum=dum+"3+";
        }
        String ans="";
        for(int i=0;i<dum.length()-1;i++){
            ans=ans+dum.charAt(i);
        }
        System.out.println(ans);
    } 
}
