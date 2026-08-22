class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // int freq[]=new int[26];
        // for(int i=0;i<s.length();i++){
        //     freq[s.charAt(i)-'a']++;
        // }
        // for(int i=0;i<t.length();i++){
        //     freq[t.charAt(i)-'a']--;
        //     if(freq[t.charAt(i)-'a']<0){
        //         return false;
        //     }
        // }
        // return true;
        String[] str1=s.split("");
        String[] str2=t.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}