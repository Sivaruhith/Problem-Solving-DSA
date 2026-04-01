class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // HashSet<Character> set=new HashSet<>();
        // for(char ch:s.toCharArray()){
        //     set.add(ch);
        // }
        // HashSet<Character> set1=new HashSet<>();
        // for(char c:t.toCharArray()){
        //     set1.add(c);
        // }
        // if(set.size()==set1.size()) return true;

        // return false;
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        return true;
    }
}