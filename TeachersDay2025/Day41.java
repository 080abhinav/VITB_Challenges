package TeachersDay2025;
import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sx=0, sy=0, sz=0;
        for (int i=0; i<n; i++) {
            int x=scn.nextInt();
            int y=scn.nextInt();
            int z=scn.nextInt();
            sx=sx+x;
            sy=sy+y;
            sz=sz+z;
        }
        if (sx==0 && sy==0 && sz==0) {
            System.out.println("YES");
        } 
        else{
            System.out.println("NO");
        }
        scn.close();
    }
}
