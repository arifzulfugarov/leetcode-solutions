class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        
        nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 2) {


            if (i > 0 && nums[i] == nums[i-1]) {
                continue
            }
            var left = i+1
            var right = nums.size - 1

            while (left < right) {
                 var sum = nums[left] + nums[right] + nums[i]

            if (sum < 0) {
                left++
            }else if (sum > 0) {
                right--
            }else{
                result.add(listOf(nums[i], nums[left], nums[right]))
                left++
                right--

                while (left < right && nums[right] == nums[right+1]) {
                    right--
                }

                while (left < right && nums[left] == nums[left-1]) {
                    left++
                }
            }

            
            }
           

          }
        
        return result

    }
}