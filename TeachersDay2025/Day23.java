package TeachersDay2025;
import java.util.Scanner;
public class Day23 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int count=0;
        while(x>0){
            if(x==1||x==2||x==3||x==4||x==5){
                count++;
                break;
            }
            x=x-5;
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
