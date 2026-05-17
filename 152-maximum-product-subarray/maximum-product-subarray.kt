class Solution {
    fun maxProduct(nums: IntArray): Int {
        

        var maxProduct = Int.MIN_VALUE
        var prefix = 1
        var suffix = 1
        val n = nums.size


        for (i in 0 until n) {

            if (prefix == 0) prefix = 1
            if (suffix == 0) suffix = 1

            prefix *= nums[i]
            suffix *= nums[n-1-i]

            maxProduct = maxOf(maxProduct, prefix, suffix)
        }

        return maxProduct
    }
}