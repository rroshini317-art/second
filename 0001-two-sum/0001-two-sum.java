import java.util.Scanner;
class Solution
 {
 int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
        if(target==nums[i]+nums[j]){
           return new int []{i,j};
        }
    }}
    return new int[]{};
 }
     public static void main(String[]argh){
        Scanner z=new Scanner(System.in);
        Solution s= new Solution();
        int n=z.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=z.nextInt();
        }
        int target =z.nextInt();
        int ans[]= s.twoSum(nums,target);
       for(int j=0;j<ans.length;j++) {
        System.out.print(ans[j]);
        }
    

    }}