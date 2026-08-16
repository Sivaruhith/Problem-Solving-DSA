class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=s.length();
        boolean b=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                b=ispalindrom(s.substring(i,j+1));
                if(b){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean ispalindrom(String s){
        StringBuilder rev=new StringBuilder(s);
        if(rev.reverse().toString().equals(s)){
            return true;
        }
        return false;
    }
}