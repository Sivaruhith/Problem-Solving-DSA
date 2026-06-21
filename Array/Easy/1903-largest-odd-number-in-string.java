class Solution {
    public String largestOddNumber(String num) {
        //int n=Integer.parseInt(num);
        //int div;
        //if((n%2)!=0){
        //    return Integer.toString(n);
        //}
        //while(n!=0){
        //    div=n/10;
        //    if((div%2)!=0){
        //        return Integer.toString(div);
        //    }
        //    n=n/10;
        //}
        //return "";
        int n;
        for(int i=num.length()-1;i>=0;i--){
            n=num.charAt(i)-'0';
            if(n%2==1){
                return num.substring(0,i+1);
            } 
        }
        return "";
    }
}