class Solution {
    public String getSmallestString(String s) {
        int n=s.length();
        String str[]=s.split("");
        for(int i=1;i<n;i++){
            int num1=Integer.parseInt(str[i-1]);
            int num2=Integer.parseInt(str[i]);
            if(num1%2==1 && num2%2==1 && num1>num2){
                String temp=str[i-1];
                str[i-1]=str[i];
                str[i]=temp;
                break;
            }
            else if(num1%2==0 && num2%2==0 && num1>num2){
                String temp=str[i-1];
                str[i-1]=str[i];
                str[i]=temp;
                break;
            }
        }
        String ans="";
        for(int i=0;i<n;i++){
            ans=ans+str[i];
        }
        return ans;
    }
}