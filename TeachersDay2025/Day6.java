package TeachersDay2025;
import java.util.*;
public class Day6 {
    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='[' || c=='{' || c=='(') {
                st.push(c);
            }
            else if(c==']' || c=='}' || c==')'){
                if(st.isEmpty()){
                    return false;
                }
                char b = st.peek();
                if((b=='['&&c==']') || (b=='{'&&c=='}') || (b=='('&&c==')')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        boolean ans = isValid(s);
        System.out.println(ans);
        scn.close();
    }
}
