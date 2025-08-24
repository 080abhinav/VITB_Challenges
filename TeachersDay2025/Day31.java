package TeachersDay2025;
import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String arr[] =new String[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextLine();
        }
        int count =1;
        for(int i=1;i<n;i++){
            if(!(arr[i]).equals(arr[i-1])){
                count++;
            }
        }
        System.out.println(count);
        scn.close();
    }
}
