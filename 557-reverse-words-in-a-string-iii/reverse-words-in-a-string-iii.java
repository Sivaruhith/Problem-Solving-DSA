class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder ans=new StringBuilder(arr[i]);
            sb.append(ans.reverse());
            
            if(i<arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}