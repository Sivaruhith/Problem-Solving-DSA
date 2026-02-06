class Solution {
    public int minRemoval(int[] nums, int k) {
        
        // int j=1;
        // int n=nums.length;
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // int result=0;
        // for(int i=0;i<n-1;i++){
        //     min=Math.min(nums[i],nums[j]);
        //     max=Math.max(nums[i],nums[j]);
        //     if(min*k==max){
        //         result=n-2;
        //         return result;
        //     }
        //     if(n==2&&nums[i]==k||nums[j]==k){
        //         return 1;
        //     }
        //     j++;
        // }
        // return result;
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int maxLen = 1;

        for (int right = 0; right < n; right++) {
            while (nums[right] > (long)nums[left] * k) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return n - maxLen;

    }
}