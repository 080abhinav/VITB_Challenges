package TeachersDay2025;
import java.util.*;
public class Day5 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int num = hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            int curr = hm.get(s.charAt(i));
            int right = hm.get(s.charAt(i+1));
            if(curr<right){
                num = num-curr;
            }
            else{
                num = num+curr;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int a = romanToInt(s);
        System.out.println(a);
        scn.close();
    }
}
