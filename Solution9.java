class Solution9 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = Integer.MIN_VALUE;
                count++;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == Integer.MIN_VALUE) {
                int u = getUnique(i, nums);
                nums[i] = u;
            }
        }
        return nums.length - count;
    }
    public static int getUnique(int start, int[] nums) {
        for(int i=start; i<nums.length; i++) {
            if(nums[i] != Integer.MIN_VALUE) {
                int temp = nums[i];
                nums[i] = Integer.MIN_VALUE;
                return temp;
            }
        }
        return 0;
    }
}
