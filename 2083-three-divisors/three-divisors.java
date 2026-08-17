class Solution {
    public boolean isThree(int n) {
        if(n<3){
            return false;
        }
        int count=1;
        for(int i=2;i<=n;i++){
            if(divisor(n,i)){
                count++;
            }
            if(count>3){
                return false;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }
    public boolean divisor(int num,int n){
        if(num%n==0){
            return true;
        }
        return false;
    }
}