class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int l=0,r=1;
        int min=Integer.MAX_VALUE;
        boolean b=false;
        while(r<n){
            if((nums[l]==1 && nums[r]==2) || (nums[l]==2 && nums[r]==1)){
                min=Math.min(min,Math.abs(l-r));
                b=true;
                l=r;
                r++;
            }
            else if((nums[l]==1 && nums[r]==1) || (nums[l]==0 && nums[r]==1) || (nums[l]==2 && nums[r]==2) || (nums[l]==0 && nums[r]==2)){
                l=r;
                r++;
            }
            else{
                r++;
            }
        }
        if(b){
            return min;
        }
        return -1;
    }
}