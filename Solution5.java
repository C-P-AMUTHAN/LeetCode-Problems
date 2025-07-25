class Solution5 {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }
        if(haystack.equals(needle)) {
            return 0;
        }
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                int start = i;
                int end = i + needle.length();
                if(end <= haystack.length()) {
                    StringBuilder s = new StringBuilder(haystack);
                    if(s.substring(start, end).equals(needle)) {
                        return start;
                    }
                } else if(start == end-1) {
                    return start;
                } 
            }
        }
        return -1;
    }
}
