class Solution {
    public int majorityElement(int[] nums) {
        
     
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>(); 
        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (freqMap.get(num) > n/2){
                return num;
            }
        }
        return -1;

    }

}