package TeachersDay2025;
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l=scn.nextInt();
        int b=scn.nextInt();
        int year=1;
        while(true){
            l=l*3;
            b=b*2;
            if(l>b){
                System.out.println(year);
                break;
            }
            year++;
        }
        scn.close();
    }
}
