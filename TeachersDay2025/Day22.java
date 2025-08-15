package TeachersDay2025;
import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int t=scn.nextInt();
        scn.nextLine();
        String str=scn.nextLine();
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<t;i++){
            int j=0;
            while(j<n-1){
                if(s.charAt(j)=='B'&& s.charAt(j+1)=='G'){
                    s.setCharAt(j, 'G');
                    s.setCharAt(j+1, 'B');
                    j=j+2; 
                }
                else{
                    j=j+1;
                }
            }
        }
        System.out.println(s);
        scn.close();
    }
}
