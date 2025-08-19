package TeachersDay2025;
import java.util.Scanner;
public class Day26 {
    public static String football(String s){
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=0;
            }
            if(count>=6){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(football(s));;
        scn.close();
    }
}
