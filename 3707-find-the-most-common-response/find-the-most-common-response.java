class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for (List<String> row : responses) {
            Set<String> combine=new HashSet<>(row);
            for (String s : combine) {
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        // List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        // list.sort(Map.Entry.<String,Integer>comparingByValue().reversed());
        // return list.get(0).getKey();
        String ans = "";
        int maxFreq = 0;


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq ||
                (freq == maxFreq && word.compareTo(ans) < 0)) {
                maxFreq = freq;
                ans = word;
            }
        }

        return ans;
    }
}