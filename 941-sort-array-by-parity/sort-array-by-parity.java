class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,k=0;
        int m=n-1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
            else{
                ans[m--]=nums[i];
            }
        }
        return ans;
    }
}