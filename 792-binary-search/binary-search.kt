class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        var left = 0
        var right = nums.size - 1


        while (left <= right) {

            var middleIndex = (left + right)/2

            if (nums[middleIndex] == target){
                return middleIndex
            }

            if (target < nums[middleIndex]){
                right = middleIndex - 1
            }else{
                left = middleIndex + 1
            }
        }
    return -1 

    }
   
}