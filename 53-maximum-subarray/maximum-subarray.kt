class Solution {
    fun maxSubArray(nums: IntArray): Int {
        
        var maxSoFar = nums[0]
        var currentSum = nums[0]

        for (i in 1 until nums.size) {

            currentSum = maxOf(nums[i], currentSum + nums[i])

            maxSoFar = maxOf(maxSoFar, currentSum)
        }

        return maxSoFar

    }
}