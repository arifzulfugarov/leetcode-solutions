class Solution {
    public int[] shuffle(int[] nums, int n) {

        int len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {

            if (i % 2 == 0) {
                res[i] = nums[i/2];
            } else {
                res[i] = nums[n + (i/2)];
            }
        } 
        return res;  
    }
}