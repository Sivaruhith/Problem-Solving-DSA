class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            //StringBuilder ans=new StringBuilder(arr[i]);
            //sb.append(ans.reverse());
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
            sb.append(arr[i]);
            if(i<arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}