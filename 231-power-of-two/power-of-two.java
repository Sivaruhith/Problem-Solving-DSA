class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=1;
        while(true){
            if(Math.pow(2,0)==n){
                return true;
            }
            if(Math.pow(2,i)<n){
                i++;
            }
            else if(Math.pow(2,i)==n){
                return true;
            }
            else{
                return false;
            }
        }
    }
}