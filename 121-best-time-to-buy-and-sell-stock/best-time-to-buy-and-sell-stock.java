class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int profit:prices){
            if(profit<min){
                min=profit;
            }
            else if(profit-min>max){
                max=profit-min;
            }
        }
        return max;
    }
}