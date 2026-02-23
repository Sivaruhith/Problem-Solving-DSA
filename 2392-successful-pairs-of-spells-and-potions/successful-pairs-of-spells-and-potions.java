//some testcase are fail 51/57 (main reason: Time Limit Exceeded 79 ms)
//class Solution {
//    public int[] successfulPairs(int[] spells, int[] potions, long success) {
//        int[] pairs= new int[spells.length];
//        for(int i=0;i<spells.length;i++){
//            int sum=0;
//            for(int j=0;j<potions.length;j++){
//                long ans = (long)spells[i]*potions[j];
//                if( ans  >= success){
//                    sum++;
//                }
//            }
//            pairs[i]=sum;
//        }
//        return pairs;
//    }
//}

//this 46 ms 
//class Solution {
//    public int[] successfulPairs(int[] spells, int[] potions, long success) {
//        Arrays.sort(potions);
//        int n = spells.length;
//        int m = potions.length;
//        int[] ans = new int[n];
//        
//        for (int i = 0; i < n; i++) {
//            long sp = spells[i];
//            int left = 0, right = m - 1;
//            int index = -1;
//            
//            while (left <= right) {
//                int mid = (left + right) / 2;
//                if (sp * potions[mid] >= success) {
//                    index = mid;
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            }
//            
//            ans[i] = (index == -1) ? 0 : (m - index);
//        }
//        
//        return ans;
//    }
//}

//this is 30 ms solved fast
import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; ++i) {
            long s = spells[i];
            long need = (success + s - 1) / s;
            int pos = lowerBound(potions, need);
            ans[i] = m - pos;
        }
        return ans;
    }

    private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if ((long)arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}