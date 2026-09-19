class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmin=0,currentmax=0;
        int min=nums[0],max=nums[0];
        int sum=0;
        for(int num:nums){
            // currentmin=Math.min(nums[i],currentmin+nums[i]);
            // currentmax=Math.max(nums[i],currentmax+nums[i]);
            currentmin+=num;
            currentmax+=num;
            min=Math.min(currentmin,min);
            max=Math.max(currentmax,max);

            if(currentmin>0) currentmin=0;
            if(currentmax<0) currentmax=0;

            sum+=num;
        }
        if(max>0){
            return Math.max(max,sum-min);
        }else{
            return max;
        }
    }
}