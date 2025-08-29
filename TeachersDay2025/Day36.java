package TeachersDay2025;
import java.util.Scanner;
import java.util.ArrayList;
public class Day36 {
    public static void gen(int a,ArrayList<Integer> num) {
        if (a>1000) {
            return;
        }
        if (a>0) {
            num.add(a);
        }
        gen(a*10+4,num);
        gen(a*10+7,num);
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        gen(0,num);
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        boolean luck=false;
        for (int i=0;i<num.size();i++) {
            if (n% num.get(i)==0) {
                luck=true;
                break;
            }
        }
        if(luck){
            System.out.println("YES");
        } 
        else{
            System.out.println("NO");
        }
        scn.close();
    }
}

