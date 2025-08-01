class Solution14 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int value = 0;
        int element = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > value) {
                value = entry.getValue();
                element = entry.getKey();
            }
        }
        return element;
    }
}
