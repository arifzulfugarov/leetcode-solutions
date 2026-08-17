class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        

        val cars = position.indices
            .map { index -> 
                Pair(position[index], speed[index])
            }
            .sortedByDescending {it.first}

            val stack = ArrayDeque<Double>()

            for ((carPosition, carSpeed) in cars) {
                val currentTime = 
                    (target - carPosition).toDouble() / carSpeed

                if (stack.isEmpty()) {
                    stack.addLast(currentTime)
                } else {

                    val fleeTime = stack.last()

                    if (currentTime > fleeTime) {
                        stack.addLast(currentTime)
                    } else {

                        stack.removeLast()
                        stack.addLast(fleeTime)
                    }
                    
                }
            }

            return stack.size
        
    }
}