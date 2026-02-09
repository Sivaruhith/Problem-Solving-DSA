class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums[i];
            ans[k++]=nums[i+n];
        }
        return ans;

        // if(n==1){
        //     return nums;
        // }
        // for(int i=1,j=n;i<n&&j<m;i+=2,j++){
        //     nums[i]=nums[j];
        //     nums[i+1]=nums[i];

        // }
        //int l=1,r=n;
        //int temp;
        //while(l!=n){
        //    temp=nums[l];
        //    nums[l]=nums[r];
        //    nums[r]=temp;
        //    l++;
        //    r++;
        //}
        //return nums;
    }
}