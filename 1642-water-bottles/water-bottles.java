class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles >= numExchange){
            int quo = numBottles / numExchange;
            int rem = numBottles % numExchange;
            //int tot = (quo+rem) / numExchange;
            numBottles = quo+rem;
            sum=sum+quo;
        }
        return sum;
    }
}