class Solution {

    private int gcd(int a,int b){
        if(a==0) return b;

        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // int min=nums[0];
        // int max=nums[nums.length-1];
        // while(min!=max){
        //     if(min>max){
        //         min=min-max;
        //     }
        //     if(max>min){
        //         max=max-min;
        //     }
        // }
        // return min;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return gcd(min,max);
    }
}