class Solution4 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch - 97]++;
        }
        for(int i=0; i<s.length(); i++) {
            if(arr[s.charAt(i)-97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
