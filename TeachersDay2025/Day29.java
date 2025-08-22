package TeachersDay2025;
import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        scn.nextLine();
        String s=scn.nextLine();
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
        }
        if(a>n-a){
            System.out.println("Anton");
        }
        else if(a<n-a){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        scn.close();
    }
}
