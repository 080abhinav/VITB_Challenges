package TeachersDay2025;
import java.util.Scanner;
public class Day20 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        int ans=0;
        scn.close();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==t.charAt(t.length()-1-i)){
                    ans=1;
                }
                else{
                    ans=0;
                    break;
                }
            }
        }
        if(ans==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
