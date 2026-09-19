class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currentmin=0,currentmax=0;
        int min=nums[0],max=nums[0];
        int sum=0;
        for(int i=0;i<n;i++){
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            min=Math.min(currentmin,min);
            max=Math.max(currentmax,max);
            sum+=nums[i];
        }
        if(max>0){
            return Math.max(max,sum-min);
        }else{
            return max;
        }
    }
}