package TeachersDay2025;
import java.util.Scanner;
import java.util.HashSet;
public class Day15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        int a = hs.size();
        if(a%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        scn.close();
    }
}
