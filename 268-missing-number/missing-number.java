class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int m=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=i){
        //         m=i;
        //         break;
        //     }
        //     else{
        //         m=n;
        //     }
        // }
        // return m;
        
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}