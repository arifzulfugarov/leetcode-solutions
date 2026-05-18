class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        

       val countMap = mutableMapOf<Int, Int>()

    for (num in nums) {
        // Get the current count from the map (default to 0 if not present) and add 1
        val currentCount = countMap.getOrDefault(num, 0) + 1
        
        // Your logic: If count is greater than 1, return true
        if (currentCount > 1) {
            return true
        }
        
        // Save the updated count back into the map
        countMap[num] = currentCount
    }

    return false
    }
}