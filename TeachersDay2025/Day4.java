package TeachersDay2025;
import java.util.*;
public class Day4 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(target-nums[i]!=nums[i]){
                if(hm.containsKey(target-nums[i])){
                    ans[0]=i;
                    for(int j=0;j<nums.length;j++){
                        if(nums[j]==target-nums[i]){
                            ans[1]=j;
                            break;
                        }
                    }
                    break;
                }
            }
            else if(target-nums[i]==nums[i]){
                if(hm.containsKey(target-nums[i]) && hm.get(target-nums[i])>1){
                    ans[0]=i;
                    for(int j=0;j<nums.length;j++){
                        if(nums[j]==target-nums[i]){
                            if(j!=i){
                                ans[1]=j;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return ans;
    }
        
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        twoSum(arr,target);
        scn.close();
    }
}

//Better Solution
// public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(hm.containsKey(target-nums[i])){
//                 return new int[]{hm.get(target-nums[i]),i};
//             }
//             hm.put(nums[i],i);
//         }
//         return new int[]{};
// }
