class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> li=new ArrayList<>(set);
        Collections.sort(li, Collections.reverseOrder());
        if(li.size()<3){
            return li.get(0);
        }
        
        return li.get(2);
    }
}