class Solution {
    public int maxDistance(int[] colors) {
        // int left=0,right=colors.length-1;
        // while(left<=right ){
        //     if(colors[left]!=colors[right]){
        //         return Math.abs(left-right);
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return 0;

        int n = colors.length;
        int maxDist = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                maxDist = Math.max(maxDist, i);
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, n - 1 - i);
                break;
            }
        }

        return maxDist;
    }
}