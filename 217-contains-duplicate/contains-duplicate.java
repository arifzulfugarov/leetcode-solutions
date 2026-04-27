class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : nums) {
            if (uniqueNumbers.contains(num)) {
                return true;
            } 
            uniqueNumbers.add(num);
        }

        return false;
    }
}