package TeachersDay2025;
import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a=scn.nextLine();
        String b=scn.nextLine();
        String c="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                c=c+"1";
            }
            else{
                c=c+"0";
            }
        }
        System.out.println(c);
        scn.close();
    }
}
