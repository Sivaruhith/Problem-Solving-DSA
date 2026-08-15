class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
        int l=0,r=n-1;
        while(l<r){
            double num=((double)nums[l]+(double)nums[r])/2;
            min=Math.min(min,num);
            l++;
            r--;
        }
        return min;
    }
}