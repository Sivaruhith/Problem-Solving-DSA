class Solution {
    public int minimumSwaps(int[] nums) {
        // int count=0;
        // int left=0,right=nums.length-1;
        // while(left<=right){
        //     if(nums[left]==0 && nums[right]!=0){
        //         count++;
        //         left++;
        //         right--;
        //     }
        //     else if(nums[left]!=0 && nums[right]!=0){
        //         left++;
        //     }
        //     else if(nums[left]!=0 && nums[right]==0){
        //         left++;
        //         right--;
        //     }
        //     else{
        //         return count;
        //     }
        // }
        // return count;

        // int r=nums.length-1,count=0; 
        // for(int i=0;i<=r;i++){
        //     if(nums[i]==0 && nums[r]!=0){
        //         count++;
        //         r--;
        //     }
        //     else if(nums[i]==0 && nums[r]==0){
        //         r--;
        //     }
        // } 
        // return count;   

        // int zero=0,swap=0;
        // for(int num:nums){
        //     if(num==0){
        //         zero++;
        //     }else if(zero>0){
        //         swap++;
        //     }
        // }
        // return swap;
        // int lastNonZero = -1;

        // // Find the last non-zero element
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     if (nums[i] != 0) {
        //         lastNonZero = i;
        //         break;
        //     }
        // }

        // int swaps = 0;

        // // Count zeros before or at the last non-zero element
        // for (int i = 0; i <= lastNonZero; i++) {
        //     if (nums[i] == 0) {
        //         swaps++;
        //     }
        // }

        // return swaps;
        int n = nums.length;
        int z = 0;
        for (int x : nums) {
            if (x == 0) z++;
        }

        int ans = 0;
        for (int i = 0; i < n - z; i++) {
            if (nums[i] == 0) ans++;
        }
        return ans;
    }
}