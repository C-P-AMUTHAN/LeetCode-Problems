class Solution3 {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch-97]++;
        }
        for(char ch : t.toCharArray()) {
            arr[ch-97]--;
        }
        for(int i=0; i<26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
