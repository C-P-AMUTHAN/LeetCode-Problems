class Solution7 {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) {
            return true;
        }
        for(int i=1; i<s.length(); i++) {
            String check = s.substring(i, s.length());
            check += s.substring(0, i);
            if(check.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
