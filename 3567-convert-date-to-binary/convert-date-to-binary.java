class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans=ans+Integer.toBinaryString(Integer.parseInt(arr[i]));
            ans=ans+"-";
        }
        return ans.substring(0,ans.length()-1);
    }
}