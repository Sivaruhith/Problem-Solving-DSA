class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        // StringBuilder rev=new StringBuilder(s);
        // rev.reverse();
        // return s.equals(rev.toString());
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}