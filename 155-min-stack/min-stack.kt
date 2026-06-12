class MinStack() {

    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()

    fun push(value: Int) {
        stack.addLast(value)

        val currentMin = if (minStack.isEmpty()) value else minOf(value, minStack.last())
        minStack.addLast(currentMin)
    }

    fun pop() {
        
        if (stack.isNotEmpty()){
            stack.removeLast()
            minStack.removeLast()
        }
    }

    fun top(): Int {
        
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(value)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */