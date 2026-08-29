class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        var start = 0
        var end = nums.size - 1

        while (start <= end) {

            val mid = start + (end-start)/2

            if (nums[mid] == target) return mid
            //meaning left side is sorted
            if (nums[mid] >= nums[start]) {

                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1
                } else {
                    start = mid + 1
                }
            }//meaning right side is sorted
            else{

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1
                }else{
                    end = mid - 1
                }
            }

        }

        return -1



    }
}