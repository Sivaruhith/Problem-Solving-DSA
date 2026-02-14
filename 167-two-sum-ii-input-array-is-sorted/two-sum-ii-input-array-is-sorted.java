class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans=new int[2];
        int n=num.length;
        int left=0,right=n-1;
        while(left<right){
            int sum=num[left]+num[right];
            if(sum==target){
                //return new int[]{left+1,right+1};
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}