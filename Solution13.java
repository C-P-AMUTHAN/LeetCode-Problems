class Solution13 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int n : nums) {
            arr.add(n);
        }
        return arr.size() == nums.length? false : true;
    }
}
