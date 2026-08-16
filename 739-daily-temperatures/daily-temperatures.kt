class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        
        val result = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for (currentIndex in temperatures.indices) {


            while (!stack.isEmpty() && temperatures[currentIndex] > temperatures[stack.last()]){

                val colderIndex = stack.removeLast()
                result[colderIndex] = currentIndex - colderIndex
            }

            stack.addLast(currentIndex)
        }

        return result
    }
}