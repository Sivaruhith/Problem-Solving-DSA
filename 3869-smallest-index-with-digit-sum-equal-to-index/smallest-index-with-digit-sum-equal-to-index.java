class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int ans;
        for(int i=0;i<n;i++){
            ans=sum(nums[i]);
            if(ans==i){
                return i;
            }
        }
        return -1;
    }
    public int sum(int val){
        int add=0;
        int rem;
        while(val!=0){
            rem=val%10;
            val=val/10;
            add+=rem;
        }
        return add;
    }
}