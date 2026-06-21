// ═══════════════════════════════════════════════════════
// Problem: 898. Transpose Matrix
// Difficulty: Easy
// Topics: Array, Matrix, Simulation
// Runtime: 0 ms (Beats 100.0%)
// Memory: 46.9 MB (Beats 11.5%)
// Submitted: Jun 21, 2026
// Link: https://leetcode.com/problems/transpose-matrix/
// ═══════════════════════════════════════════════════════

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
