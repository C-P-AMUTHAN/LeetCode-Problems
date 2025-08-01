class Solution10 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        for(int i: nums1) {
            n1.add(i);
        }
        HashSet<Integer> arr = new HashSet<>();
        for(int i : nums2) {
            if(n1.contains(i)) {
                arr.add(i);
            }
        }
        int[] nAr = new int[arr.size()];
        int iter = 0;
        for(int i: arr) {
            nAr[iter] = i;
            iter++; 
        }
        return nAr;
    }
}
