class MinStack() {

    private var capacity = 30000
    private var stack = IntArray(capacity)
    private var minStack = IntArray(capacity)
    private var topIndex = -1

    fun push(value: Int) {

        topIndex++
        stack[topIndex] = value

        if (topIndex == 0) {
            minStack[topIndex] = value
        }else{
            val currentMin = minStack[topIndex-1]
            minStack[topIndex] = if (value < currentMin) value else currentMin
        }

    }

    fun pop() {
        
       if (topIndex >= 0) {
            topIndex--
       }
    }

    fun top(): Int {
        
        return stack[topIndex]
    }

    fun getMin(): Int {
        return minStack[topIndex]
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