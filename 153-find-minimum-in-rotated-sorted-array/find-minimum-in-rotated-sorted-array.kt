class Solution {
    fun findMin(nums: IntArray): Int {
        
        val n = nums.size
        var left = 0
        var right = n-1
        var firstResultIndex = -1

        while (left <= right) {

            val mid = left + (right-left)/2

            if (nums[mid] <= nums[n-1]){
                firstResultIndex = mid
                right = mid - 1
            }else {
                left = mid + 1
            }
        }

        return nums[firstResultIndex]
    }
}