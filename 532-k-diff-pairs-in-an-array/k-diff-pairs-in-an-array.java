class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int left=0,right=1;
        if (k == 0) {
            int i = 0;
            while (i < n - 1) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                    int val = nums[i];
                    while (i < n && nums[i] == val) {
                        i++; // skip all duplicates
                    }
                } else {
                    i++;
                }
            }
            return count;
        }
        while(right<n){
            if(nums[right]-nums[left]==k){
                count++;
                left++;
                right++;
                while(right<n && nums[right]==nums[right-1]){
                    right++;
                }
            }
            else if(left==right||nums[right]-nums[left]<k){
                right++;
            }
            else{
                left++;
            }
        }
        return count;
    }
}