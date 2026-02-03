class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}