class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        
        val m = matrix.size
        val n = matrix[0].size

        val lengthofMatrix = m * n

        var left = 0
        var right = lengthofMatrix - 1

        while (left <= right) {
            
            val mid = left + (right-left)/2

            val row = mid / n
            val col = mid % n

            val midValue = matrix[row][col] 

            if (midValue == target) {
                return true
            }
            if (midValue > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

         return false

    }

   
}