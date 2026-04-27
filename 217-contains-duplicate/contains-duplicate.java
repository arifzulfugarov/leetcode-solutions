class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            if (counts.containsKey(num)) {
                return true;
            } else {
                counts.put(num, 1);
            }
        }

        return false;
    }
}