class Solution {
    public int findNumbers(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // String[] arr=new String[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=String.valueOf(nums[i]);
        //     if(arr[i].length()%2==0){
        //         count++;
        //     }
        // }
        // return count;

        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digit=0;
            int num=nums[i];
            while(num!=0){
                num=num/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}