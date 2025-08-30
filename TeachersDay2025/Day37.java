package TeachersDay2025;
import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        scn.close();
        boolean check=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='H' || s.charAt(i)=='Q'||s.charAt(i)=='9'){
                check=true;
            }
        }
        if(check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
