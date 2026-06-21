// ═══════════════════════════════════════════════════════
// Problem: 1833. Find the Highest Altitude
// Difficulty: Easy
// Topics: Array, Prefix Sum
// Runtime: 0 ms (Beats 100.0%)
// Memory: 43 MB (Beats 59.7%)
// Submitted: Jun 21, 2026
// Link: https://leetcode.com/problems/find-the-highest-altitude/
// ═══════════════════════════════════════════════════════

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            sum=sum+gain[i];
            max=Math.max(sum,max);
        }
        return max;
        
    }
}
