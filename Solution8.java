class Solution8 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str = "";
        for(int i=s.length()-1; i>=0; i--) {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                str += s.charAt(i);
            }
        }
        int iter = 0;
        for(char ch : s.toCharArray()) {
            if((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
                if(ch != str.charAt(iter)) {
                    return false;
                }
                iter++;
                if(iter == str.length()) break;
            }
        }
        return true;
    }
}
