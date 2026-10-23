class Solution {
    public int secondHighest(String s) {
        int num=s.length();
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<num;i++){
            if(Character.isDigit(s.charAt(i))){
                int n=Integer.parseInt(String.valueOf(s.charAt(i)));
                set.add(n);
            }
        }
        if(set.size()<2){
            return -1;
        }
        ArrayList<Integer> ans=new ArrayList<>(set);
        return ans.get(set.size()-2);
    }
}