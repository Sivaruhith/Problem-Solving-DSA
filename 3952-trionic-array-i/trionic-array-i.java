class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length,i=0;
        if(n<4){
            return false;
        }
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0) return false;
        int des=i;
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i==des) return false;
        int inc=i;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==inc) return false;
        return i==n-1;
    }
}