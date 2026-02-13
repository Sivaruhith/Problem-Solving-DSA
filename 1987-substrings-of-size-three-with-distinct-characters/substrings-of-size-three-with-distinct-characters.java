class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] arr=s.toCharArray();
        for(int i=2;i<s.length();i++){
            if(arr[i]!=arr[i-1]&&arr[i-1]!=arr[i-2]&&arr[i]!=arr[i-2]){
                count++;
            }
        }
        return count;
    }
}