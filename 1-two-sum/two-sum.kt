class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val seenNumbers = HashMap<Int, Int>()

        for (i in nums.indices) {

            val complement = target - nums[i]

            if (seenNumbers.containsKey(complement)) {
                return intArrayOf(seenNumbers[complement]!!, i)
            }

            seenNumbers[nums[i]] = i
        }

        return intArrayOf()

    }
}