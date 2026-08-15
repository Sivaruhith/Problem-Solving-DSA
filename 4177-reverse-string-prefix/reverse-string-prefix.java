class Solution {
    public String reversePrefix(String s, int k) {
        int right=k-1,left=0;
        char c[]=s.toCharArray();
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }
}