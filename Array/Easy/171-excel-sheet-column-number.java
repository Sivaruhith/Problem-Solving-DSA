class Solution {
    public int titleToNumber(String col) {
        int ans=0;
        for(int i=0;i<col.length();i++){
            char c=col.charAt(i);
            int val=c-'A'+1;
            ans=ans*26+val;
        }
        return ans;
    }
}