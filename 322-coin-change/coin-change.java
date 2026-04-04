class Solution {
    public int coinChange(int[] coins, int amount) {
        // if(amount==0) return 0;
        // Arrays.sort(coins);
        // int count=0;
        // int i=coins.length-1;
        // while(amount!=0){
        //     if(coins[i]<=amount){
        //         count=amount/coins[i]+count;
        //         amount=amount%coins[i];
        //     }
        //     else if(coins[i]>amount && i!=0){
        //         i--;
        //     }else{
        //         return -1;
        //     }
            
        // }
        // return count; // 51/189 test cases passed
        int[] dp = new int[amount + 1];

        // Fill with large value
        Arrays.fill(dp, amount + 1);

        dp[0] = 0; // base case

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];

    }
}