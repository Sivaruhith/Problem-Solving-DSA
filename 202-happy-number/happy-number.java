class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=0 && !s.contains(n)){
            s.add(n);
            n=square(n);
        }
        if(n!=1){
            return false;
        }
        return true;
    }
    public int square(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            n=(int)n/10;
            sum=sum+(d*d);
        }
        return sum;    
    }
}