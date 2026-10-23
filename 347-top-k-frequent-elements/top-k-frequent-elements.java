class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}