class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int rem;
        int num=n;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            product=product*rem;
        }
        return num%(sum+product)==0;
    }
}