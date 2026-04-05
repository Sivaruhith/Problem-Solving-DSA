class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(nums[i]);
            if(arr[i].length()%2==0){
                count++;
            }
        }
        return count;
    }
}