package TeachersDay2025;
import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] m = new int[5][5];
        int a=0;
        int b=0;
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                m[i][j]=scn.nextInt();
                if(m[i][j]==1){
                    a=i;
                    b=j;
                }
            }
        }
        while (true) {
            if(a==2){
                break;
            }
            if(a>2){a--;}
            if(a<2){a++;}
            count++;
        }
        while (true) {
            if(b==2){
                break;
            }
            if(b>2){b--;}
            if(b<2){b++;}
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
