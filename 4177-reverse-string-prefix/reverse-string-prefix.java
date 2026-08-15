class Solution {
    public String reversePrefix(String s, int k) {
        int n=s.length();
        int right=k-1,left=0;
        String str[]=s.split("");
        String ans="";
        while(left<right){
            String temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        // return Arrays.toString(str);
        for(int i=0;i<n;i++){
            ans+=str[i];
        }
        return ans;
    }
}