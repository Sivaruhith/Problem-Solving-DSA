class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < n; i += 2) {
            even.add(nums[i]);
        }
        for (int i = 1; i < n; i += 2) {
            odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int ans[]=new int[n];
        int l=0,r=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=even.get(l++);
            }else{
                ans[i]=odd.get(r++);
            }
        }
        return ans;
    }
}