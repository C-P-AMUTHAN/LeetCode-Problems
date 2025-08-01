class Solution12 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int num = 0;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                if(num  > 0) {
                    digits[i] = digits[i] + num;
                } else {
                    digits[i]++;
                }
                num = 0;
                break;
            }else {
                num = digits[i] + 1;
                digits[i] = num % 10;
                num /= 10;
            }
        }
        int[] nAr = new int[n+1];
        int iter = 0;
        if(num == 1) {
            for(int i=0; i<n+1; i++) {
                if(i == 0) {
                    nAr[i] = num;
                }else {
                    nAr[i] = digits[iter];
                    iter++;
                }
            }
            return nAr;
        }
        return digits;
    }
}
