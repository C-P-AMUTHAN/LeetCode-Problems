class Solution {
    public int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }
        int low = 0, high = x/2, ans = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;
            if(square == x) {
                return mid;
            }
            else if(square < x) {
                ans = mid;
                low = mid + 1;

            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
