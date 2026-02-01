class Solution {
    public int minimumCost(int[] nums) {
        int fi=nums[0];
        int min=nums[1];
        int ans=Integer.MAX_VALUE;
        for(int i=2;i<nums.length;i++){
            ans=Math.min(ans,fi+min+nums[i]);
            min=Math.min(min,nums[i]);
        }
        return ans;
    }
}