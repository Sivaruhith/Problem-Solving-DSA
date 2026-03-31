class Solution {
    public int majorityElement(int[] nums) {
        // int res=0;
        // int mid=nums.length/2;
        // Arrays.sort(nums);
        // if(nums[mid]==nums[nums.length-1]){
        //     return nums[mid];
        // }else if(nums[mid]==nums[0]){
        //     return nums[mid-1];
        // }
        // return res;
        int count=0;
        int maj=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                maj=nums[i];
            }
            if(nums[i]==maj){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
}