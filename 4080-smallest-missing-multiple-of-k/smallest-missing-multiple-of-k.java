class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        for(int num:nums){
            if(num%k==0){
                li.add(num);
            }
        }
        int mul=1;
        for(int i=0;i<li.size();i++){
            if(!li.contains(k*mul)){
                return k*mul;
            }
            else{
                mul++;
            }
        }
        return k*mul;
    }
}