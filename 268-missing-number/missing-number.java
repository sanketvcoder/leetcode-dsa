class Solution {
    private static boolean search(int[] nums,int n){
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == n){
                return true;
            }else if(n < nums[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return false;
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;

        int min = nums[0];
        int max = nums[l];
        int ans = 0;

        
        
        int i = 0;
        System.out.println(min + " == " + max);
        while(i < max+2){
            System.out.println(i);
            if(!search(nums,i)){
                ans = i;
                // System.out.println(ans);
                break;
            }
            i++;
        }
        return ans;
    }
}