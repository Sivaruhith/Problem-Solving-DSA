class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        int l=0,r=n-1;
        if(n<2){
            return 0;
        }
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                return l;
            }
            else{
                l++;
                r--;
            }
        }
        if(n%2!=0){
            return l;
        }else{
            return -1;
        }
    }
}