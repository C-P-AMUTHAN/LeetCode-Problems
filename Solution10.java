class Solution10 {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0, j = 0;
        while(j < s.length && i < g.length) {
            if(g[i] <= s[j]) {
                count++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return count;
    }
}
