package TeachersDay2025;
import java.util.Scanner;
public class Day8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String arr[]= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.next();
            if(arr[i].length()>10){
                arr[i] = ""+ arr[i].charAt(0)+(arr[i].length()-2)+arr[i].charAt(arr[i].length()-1);
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        scn.close();
    }
}
