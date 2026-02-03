class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            if (arr[l] >= 'a' && arr[l] <= 'z' || arr[l] >= 'A' && arr[l] <= 'Z') {
                if (arr[r] >= 'a' && arr[r] <= 'z' || arr[r] >= 'A' && arr[r] <= 'Z') {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                } else {
                    r--;
                }
            }
            else{
                l++;
            }
        }
        return new String(arr);
    }
}