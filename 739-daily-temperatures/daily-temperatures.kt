class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        
        val size = temperatures.size
        val stack = IntArray(size)

        var left = 0

        while (left < size){
            

            var right = left + 1

            
            while (right < size){
                if (temperatures[left] < temperatures[right]){
                    stack[left] = right - left
                    break
                }
                right++
            }
            
            left++
        
            
        }

        return stack
    }
}