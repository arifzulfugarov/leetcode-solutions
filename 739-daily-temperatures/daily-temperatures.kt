class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        
        val result = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for (currentIndex in temperatures.indices) {


            while (!stack.isEmpty() && temperatures[currentIndex] > temperatures[stack.last()]){

                val colderDayIndex = stack.removeLast()
                result[colderDayIndex] = currentIndex - colderDayIndex
            }

            stack.addLast(currentIndex)
        }

        return result
    }
}